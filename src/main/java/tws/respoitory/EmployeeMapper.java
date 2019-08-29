package tws.respoitory;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import tws.entity.Employee;

@Mapper
public interface EmployeeMapper {

	@Select("select * from employee")
	public List<Employee> queryAllEmployee();
}
