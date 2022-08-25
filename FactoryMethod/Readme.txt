Factory method is a creational design pattern which solves the problem of creating product objects without specifying their concrete classes.
The Factory Method defines a method, which should be used for creating objects instead of using a direct constructor call (new operator).
Subclasses can override this method to change the class of objects that will be created.

/*==============================*/

là một mẫu thiết kế sáng tạo để giải quyết vấn đề tạo các đối tượng sản phẩm mà không chỉ định các lớp cụ thể của chúng. 
Phương thức nhà máy xác định một phương thức, nên được sử dụng để tạo các đối tượng thay vì sử dụng lệnh gọi hàm tạo trực tiếp (new toán tử). 
Các lớp con có thể ghi đè phương thức này để thay đổi lớp đối tượng sẽ được tạo.