package clases.c8_oop.accesmodifiers;

public class ModificadoresEjercicio {
        public static void main(String[] args) {  
                // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
                var person2 = new Person2("Nicolas", 18);
                System.out.println(person2.getName() + " " +person2.getAge());

                // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
                var product2 = new Product2(100000);
                System.out.println(product2.getPrice());
                product2.setPrice(30000);
                System.out.println(product2.getPrice());
                
                // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
                var bankAccount2 = new BankAccount2();
                bankAccount2.deposit(20000);
                bankAccount2.withdraw(100000);
                System.out.println(bankAccount2.getBalance());

                // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
                var book2 = new Book2("The Alchemist");
                System.out.println(book2.getTittle());

                // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
                var temperature = new Temperature();
                temperature.setCelsius(400);
                System.out.println(temperature.getCelsius());

                // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
                var user = new User("Nicolas", "12345");
                user.checkPassword("123121213");
                
                // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
                var employee = new Employee(100);
                System.out.println(employee.getSalary());
                employee.raiseSalary(10);
                System.out.println(employee.getSalary());

                // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
                var rectangle = new Rectangle(100, 100);
                System.out.println(rectangle.calculateArea());

                // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
                var student = new Student();
                student.setGrade(60);
                System.out.println(student.isPassed());

                // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).

                var car = new Car();
                car.setSpeed(100);
                car.accelerate(100);
                System.out.println(car.getSpeed());
                car.brake(100);
                System.out.println(car.getSpeed());
        }
}
