package com.example.sitraexampleproj.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface repository extends JpaRepository<user,Long> {
    @Query("select e from user e where e.phoneNumber = ?1")
    public user check(Long phoneNumber);
}
