package fpt.com.vn.training.services;

import fpt.com.vn.training.dtos.UserDto;
import fpt.com.vn.training.entities.User;
import fpt.com.vn.training.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
//    public Page<UserDto> findAll(Pageable pageable) {
//
//        List<User> user = userRepository.findAll();
//        Page<User> pageOfUser = new PageImpl<User>(user, pageable, user.size());
//
////        Page<UserDto> pageofUserDto = PageableExecutionUtils.copy(pageOfUser, UserDto.class, pageable);
//
////        return pageofUserDto;
//    }
}
