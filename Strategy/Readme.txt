Strategy is a behavioral design pattern that turns a set of behaviors into objects 
and makes them interchangeable inside original context object.

The original object, called context, holds a reference to a strategy object. 
The context delegates executing the behavior to the linked strategy object. 
In order to change the way the context performs its work, 
other objects may replace the currently linked strategy object with another one.

/*====================*/

Strategy (Chiến lược) là một behavioral design pattern (mẫu thiết kế hành vi) 
biến một tập hợp các hành vi thành các đối tượng 
và làm cho chúng có thể hoán đổi cho nhau bên trong đối tượng ngữ cảnh ban đầu.

Đối tượng ban đầu, được gọi là ngữ cảnh, giữ một tham chiếu đến một đối tượng chiến lược. 
Bối cảnh ủy quyền thực thi hành vi cho đối tượng chiến lược được liên kết. 
Để thay đổi cách ngữ cảnh thực hiện công việc của nó, 
các đối tượng khác có thể thay thế đối tượng chiến lược hiện được liên kết bằng một đối tượng khác.