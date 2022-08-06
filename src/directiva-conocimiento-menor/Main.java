public class Main {
    public static void main(String[] args) {

        // 1. ABSTRACCIÓN
        FacturaElectrica fe = new FacturaElectricaEmpresas();
        System.out.println(fe.calcular());

        FacturaElectrica feu = new FacturaElectricaUsuarios();
        System.out.println(feu.calcular());


        // 2. DTO
        User franky = new User("Franky");
        franky.addVehicle(new Vehicle("Car"));

         User bridget = new User("Bridget");
         bridget.addVehicle(new Vehicle("Car"));

         DTOUsers users = new DTOUsers();
         users.addUsers(franky);
         users.addUsers(bridget);

         User userInfo = users.getUser("franky");
         System.out.println(userInfo.name);
         for(Vehicle vehicle : userInfo.vehicles) {
            System.out.println(vehicle.type);
         }
    }
}
