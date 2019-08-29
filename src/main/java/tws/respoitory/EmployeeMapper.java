package tws.respoitory;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tws.entity.Employee;
@Mapper
public interface EmployeeMapper {

	public List<Employee> queryAllEmployee();
}
