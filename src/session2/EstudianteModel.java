/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Docente
 */
public class EstudianteModel {
    private List<Estudiante> estudiantes; 

    public EstudianteModel() {
        estudiantes = new ArrayList<>();
    }
    
    public void add(Estudiante e){
        estudiantes.add(e);
    }
    
    public List<Estudiante> getAll(){
        return this.estudiantes;
    }
    
    public List<Estudiante> getByName(String name){
        List<Estudiante> byName = new ArrayList<>();
        estudiantes.stream().filter(
                (e) -> (e.getNombres().
                        equalsIgnoreCase(name))).
                forEach((e) -> {
            byName.add(e);
        });
        return byName;
    }
            
    
    
}
