package com.example.sitraexampleproj.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicerepo {

    public repository repo;
    @Autowired
    public servicerepo(repository rep){
        this.repo = rep;
    }


    public void adduser(user user){
        repo.save(user);
    }

    public List<user> findall(){
        return repo.findAll();
    }

    public Boolean  checklogin(login lo){
//        return (repo.check(lo.getPhone() ) != null)? repo.check(lo.getPhone()).getPassword() : "hello";
        if( repo.check(lo.getPhone()) != null){
            if(repo.check(lo.getPhone()).getPassword().equals(lo.getPassword().toString())){return true;}
            else{return false;}
        }
        else{
            return false;
        }
    }
    public String findname(login lo){
        return repo.check(lo.getPhone()).getFirstName();
    }

}
