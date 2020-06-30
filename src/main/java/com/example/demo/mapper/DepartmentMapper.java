package com.example.demo.mapper;

import com.example.demo.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{deptId}")
    public Department getDeptById(Integer deptId);

    @Delete("delete from department where id = #{deptId}")
    public int deleteDeptById(Integer deptId);

    //in department, id is configured as auto-increment
    //use option "useGeneratedKeys" to show the id which in auto-increasingly generated
    //here the dN in #{} means department.departmentName (get the field from the param obj)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    //here the dN and id in #{} means department.departmentName and department.id (get the field from the param obj)
    @Update("update department set departname=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
