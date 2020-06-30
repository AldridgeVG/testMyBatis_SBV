package com.example.demo.mapper;

import com.example.demo.bean.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{deptId}")
    public Department getDeptById(Integer deptId);

    @Delete("delete from department where id = #{deptId}")
    public int deleteDeptById(Integer deptId);

    //in department, id is configured as auto-increment
    //here the dN in #{} means department.departmentName (get the field from the param obj)
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);
}
