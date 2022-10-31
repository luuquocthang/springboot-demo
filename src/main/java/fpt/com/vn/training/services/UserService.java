package fpt.com.vn.training.services;

import fpt.com.vn.training.dtos.MessageDto;
import fpt.com.vn.training.dtos.UserDto;
import fpt.com.vn.training.entities.Employee;
import fpt.com.vn.training.entities.User;
import fpt.com.vn.training.enums.ActiveEnum;
import fpt.com.vn.training.repository.UserRepository;
import org.modelmapper.Converters;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

//    public Page<UserDto> findAll(Boolean active, Pageable pageable) {
//
//        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("id").descending());
//        System.out.println("ok0");
//        Page<User> pageOfUser = active == null ? userRepository.findAll(pageable)
//                : userRepository.findByActive(active == true ? ActiveEnum.ACTIVE : ActiveEnum.IN_ACTIVE, pageable);
//        System.out.println("ok");
//        Page<UserDto> pageofUserDto = pageOfUser.map(obj -> modelMapper.map(obj, UserDto.class));
//
//        return pageofUserDto;
//    }

    public MessageDto createUser(UserDto userDto) {
//        User user = modelMapper.map(userDto, User.class);
        User user = new User();
        user.setRole(userDto.getRole() == null ? "Guest": user.getRole());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setActive(ActiveEnum.ACTIVE);
//        Employee employee = new Employee();
//        user.setEmployeeRefer(employee);
        userRepository.save(user);
        return new MessageDto("201", "user created", null, null, null);
    }

    public Page<UserDto> findAll(Boolean active, Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by("id").descending());
        Page<User> pageOfUser = active == null ? userRepository.findAll(pageable)
                : userRepository.findByActive(active == true ? ActiveEnum.ACTIVE : ActiveEnum.IN_ACTIVE, pageable);
        Page<UserDto> pageofUserDto = pageOfUser.map(obj -> modelMapper.map(obj, UserDto.class));
        return pageofUserDto;
    }
}
