package Controller;

import Conexion.Conexion;
import Entity.Empleado;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpleadoController {
    Conexion conBD = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(conBD.Conectar());
    ModelAndView moVI = new ModelAndView();
    
    @RequestMapping("index.htm")
    public ModelAndView ListarEmpleado(){
        String sql="select * from empleado";
        List registros = this.jdbcTemplate.queryForList(sql);
        moVI.addObject("lista",registros);
        moVI.setViewName("index");
        return moVI;
    }
    
    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar(){
        moVI.addObject(new Empleado());
        moVI.setViewName("agregar");
        return moVI;
    }
    
    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar (Empleado emp){
        String sql="insert into empleado(id_Empleado, nombre_Empleado, salario) values (?,?,?)";
        this.jdbcTemplate.update(sql,emp.getId_empleado(),emp.getNombre_Empleado(),emp.getSalario());
        return new ModelAndView("redirect:/index.htm");
    }
    
}
