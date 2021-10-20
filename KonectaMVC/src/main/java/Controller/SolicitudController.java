package Controller;

import Conexion.Conexion;
import Entity.Empleado;
import Entity.Solicitud;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SolicitudController {
    Conexion conBD = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(conBD.Conectar());
    ModelAndView moVI = new ModelAndView();
    
    @RequestMapping("indexSolicitudes.htm")
    public ModelAndView ListarSolicitud(){
        String sql="select * from solicitud";
        List registros = this.jdbcTemplate.queryForList(sql);
        moVI.addObject("listaSolicitudes",registros);
        moVI.setViewName("indexSolicitudes");
        return moVI;
    }
    
    @RequestMapping("index.htm")
    public ModelAndView ListarEmpleado(){
        String sql="select * from empleado";
        List registros = this.jdbcTemplate.queryForList(sql);
        moVI.addObject("lista",registros);
        moVI.setViewName("index");
        return moVI;
    }
    
    @RequestMapping(value = "agregarSoli.htm", method = RequestMethod.GET)
    public ModelAndView AgregarSolicitud(){
        moVI.addObject(new Solicitud());
        moVI.setViewName("agregarSoli");
        return moVI;
    }
    
    @RequestMapping(value = "agregarSoli.htm", method = RequestMethod.POST)
    public ModelAndView AgregarSolicitud (Solicitud soli, Empleado emp){
        String sql="insert into solicitud(id_solicitud, codigo_Solicitud, descripcion_Solicitud,resumen_Solicitud) values (?,?,?,?)";
        this.jdbcTemplate.update(sql,soli.getId_solicitud(),soli.getCodigo_Solicitud(),soli.getDescripcion_Solicitud(),soli.getResumen_Solicitud());
        return new ModelAndView("redirect:/indexSolicitudes.htm");
    }
}
