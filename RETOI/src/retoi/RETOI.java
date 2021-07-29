
package retoi;


public class RETOI {

    
    public static void main(String[] args){
    // 1.  Se procede a instanciar la clase.
    PersonClass inst_person = new PersonClass("Patricia", "Cedula", 40782026, 44, 'f', 79.5f, 1.65f, "3202312679", "Cra 14 centro", "word.com25@gmail", true);  
    System.out.println(inst_person.consultar_informacion_persona());
    inst_person.consultar_info_persona();
    inst_person.consultar_informacion_persona(31193040);
    inst_person.iniciar_sesion(40782026);
    inst_person.editar_perfil();
    inst_person.cerrar_sesion();
    
    }
    
}
