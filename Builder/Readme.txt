Builder is a creational design pattern, which allows constructing complex objects step by step.

Unlike other creational patterns, Builder doesn’t require products to have a common interface. 
That makes it possible to produce different products using the same construction process.

/*--------------------------------------*/

Builder là một mẫu thiết kế sáng tạo, thuộc nhóm khởi tạo (Creational)
cho phép xây dựng các đối tượng phức tạp theo từng bước.

Không giống như các mẫu sáng tạo khác, 
Builder không yêu cầu các sản phẩm phải có giao diện chung. 
Điều đó làm cho nó có thể sản xuất các sản phẩm khác nhau 
bằng cách sử dụng cùng một quy trình xây dựng.

/*------------------*/

Trong code mầu:
- Yêu cầu xây dựng một chiếc xe hơi (Car)
- Người dùng có thể thông qua lớp Director để yêu cầu xây dựng loại xe cụ thể
- Lớp Director nhận yêu cầu và thêm các thành phần cho xe (set các thuộc tính cho builder)
- Sau khi Director chạy xong, builder sẽ có đầy đủ thành phần (giá trị của thuộc tính).
- Khi này builder có thể trả về một chiếc xe mới (Car) thông qua phương thức getResult().