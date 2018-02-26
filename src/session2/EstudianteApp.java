/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2;

/**
 *
 * @author Docente
 */
public class EstudianteApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteModel emodel = new EstudianteModel();
        Estudiante e1 = new Estudiante(
                1,"Pepito","Perez","20153698U",18);
        Estudiante e2 = new Estudiante(
                2,"Ana","Peralta","20163698U",19);
        Estudiante e3 = new Estudiante(
                3,"Ana","Conda","20173699U",20);
        emodel.add(e1);
        emodel.add(e2);
        emodel.add(e3);
        System.out.format("%5s %10s %10s %10s %5s\n",
                "Id","Nombres","Apellidos","Carnet","Edad");
        for(Estudiante e : emodel.getByName("A")){
            print(e);
        }
        
    }
    
    public static void print(Estudiante e){
        System.out.format("%5d %10s %10s %10s %5d\n",
                e.getId(),e.getNombres(),e.getApellidos(),
                e.getCarnet(),e.getEdad());
    }
    
}
