Adapter is a structural design pattern, which allows incompatible objects to collaborate.

The Adapter acts as a wrapper between two objects. 
It catches calls for one object and transforms them to format and interface recognizable by the second object.

/*------------------*/

Adapter (bộ điều hợp) là một mẫu thiết kế cấu trúc(Structural), cho phép các đối tượng không tương thích cộng tác với nhau.

Adapter (bộ điều hợp) hoạt động như một trình bao bọc giữa hai đối tượng. 
Nó bắt các cuộc gọi cho một đối tượng và chuyển chúng sang định dạng và giao diện có thể nhận ra bởi đối tượng thứ hai.

/*----------------/
Trong code mẫu:
- Lỗ hình tròn chỉ nhận được đầu vào là chốt hình tròn.
- Nhưng đầu vào của bài toán cung cấp một chốt hình vuông.
- Nhiệm vụ của Adapter là:
	+ dựa vào kích thước của chốt hình vuông (đầu vào được cung cấp),
	+ Tính toán để cho biết kích thước (bán kính) của chốt hình tròn tương ứng (với chốt hình vuông)
	để lỗ hình tròn có thể nhận vào và xử lý.