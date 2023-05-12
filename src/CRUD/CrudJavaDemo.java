package CRUD;
 
import CRUD.controller.ControllerCliente;
 
import CRUD.model.Cliente;
 
public class CrudJavaDemo {
    public static void main(String[] args) {
        // controlador
        ControllerCliente controller = new ControllerCliente();

        // ver clientes
        System.out.println("R_Clientes-tabla Ventas.Cliente (Read-CRUD)");
        controller.verClientes();
        
        Cliente cliente = new Cliente(99, "Maria", "Rodriguez","99999999X");
        Cliente cliente1 = new Cliente(123, "Jose", "Perez","36157689X");
        Cliente cliente2 = new Cliente(124, "Manuel", "Perez","36157689X");
        Cliente cliente3 = new Cliente(125, "Manuel", "Perez","36157689X");
        // guarda un cliente a través del controlador
        controller.registrar(cliente);
        controller.registrar(cliente1);
        controller.registrar(cliente2);
        controller.registrar(cliente3);

        // ver clientes de nuevo
        System.out.println("C_Clientes-tabla Ventas.Cliente (Create-CRUD)");
        controller.verClientes();

        // editar un cliente por medio del id
        cliente.setId(100);
        cliente.setNombre("Otro nombre");
        controller.actualizar(cliente);

         // ver clientes de nuevo
        System.out.println("U_Clientes-tabla Ventas.Cliente (Update-CRUD)");
        controller.verClientes();
        
        // eliminar un cliente por medio del id
        //cliente.setId(1);
       // controller.eliminar(cliente);
        
         // ver clientes de nuevo
        System.out.println("D_Clientes-tabla Ventas.Cliente (Delete-CRUD)");
        controller.verClientes();
    }
}