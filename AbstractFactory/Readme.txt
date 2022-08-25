Abstract Factory is a creational design pattern, which solves the problem of creating entire product families without specifying their concrete classes.

Abstract Factory defines an interface for creating all distinct products but leaves the actual product creation to concrete factory classes. 
Each factory type corresponds to a certain product variety.

The client code calls the creation methods of a factory object instead of creating products directly with a constructor call (new operator). 
Since a factory corresponds to a single product variant, all its products will be compatible.

Client code works with factories and products only through their abstract interfaces. 
This lets the client code work with any product variants, created by the factory object. 
You just create a new concrete factory class and pass it to the client code.

/* ======== */

Abstract Factory là một mẫu thiết kế sáng tạo, giải quyết vấn đề tạo ra toàn bộ họ sản phẩm mà không chỉ định các lớp cụ thể của chúng.

Abstract Factory định nghĩa một giao diện để tạo tất cả các sản phẩm riêng biệt nhưng để việc tạo sản phẩm thực tế cho các lớp nhà máy cụ thể. 
Mỗi loại hình nhà máy tương ứng với một loại sản phẩm nhất định.

Mã khách hàng gọi các phương thức tạo của một đối tượng nhà máy thay vì tạo sản phẩm trực tiếp bằng một lệnh gọi phương thức khởi tạo ( new toán tử). 
Vì một nhà máy tương ứng với một biến thể sản phẩm duy nhất, nên tất cả các sản phẩm của nhà máy đó sẽ tương thích.

Mã khách hàng chỉ hoạt động với các nhà máy và sản phẩm thông qua các giao diện trừu tượng của chúng. 
Điều này cho phép mã khách hàng hoạt động với bất kỳ biến thể sản phẩm nào, được tạo bởi đối tượng nhà máy. 
Bạn chỉ cần tạo một lớp nhà máy bê tông mới và chuyển nó cho mã khách hàng.