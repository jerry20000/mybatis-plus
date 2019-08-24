package cn.sisyphe.test.user.web;

import cn.sisyphe.test.user.model.User;
import cn.sisyphe.test.user.service.UserService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：Jerry
 * @date ：Created in 2019/4/21 0:01
 * @description：${description}
 */
@RequestMapping("/api/demo")
@RestController
@Api(description = "Demo")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "find")
    @GetMapping("/find")
    public List<User> findList() {
        Map<String,Object> condition = new HashMap<>();
        condition.put("userNameLike","lisi");
        List<User> users = userService.selectUserByMap(condition);
        return users;
    }

    @ApiOperation(value = "findPage")
    @GetMapping("/findPage")
    public IPage<User> findPage() {
        Page<User> userPage = new Page<>(1, 2);
        Map<String,Object> condition = new HashMap<>();
        //condition.put("userNameLike","lisi");
        IPage<User> result = userService.selectUserPage(userPage,condition);
        //IPage<User> result = userService.page(userPage);
        return result;
    }

    @ApiOperation(value = "save")
    @PostMapping("/save")
    public User save(@RequestBody User user) {
        userService.save(user);
        return user;
    }

    @ApiOperation(value = "update")
    @PostMapping("/update")
    public User update(@RequestBody User user) {
        userService.updateById(user);
        return user;
    }

    @ApiOperation(value = "delete")
    @DeleteMapping("/delete/{id}")
    public int delete(@PathVariable("id") Long id) {
        userService.removeById(id);
        return 0;
    }

    @ApiOperation(value = "detail")
    @GetMapping("/detail/{id}")
    public User detail(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @ApiOperation(value = "test1")
    @GetMapping("/test/{userName}")
    public User test1(@PathVariable("userName") String userName) {
        return null;
    }

    @ApiOperation(value = "test like")
    @GetMapping("/testLike/{userName}")
    public List<User> test2(@PathVariable("userName") String userName) {
        return null;
    }
}
