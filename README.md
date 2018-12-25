CNPM
======================== BUILD OUTPUT DESCRIPTION
======================== Giới thiệu về phần mềm
-
====================================== Hướng dẫn sử dụng ứng dụng cộng hai số

Tải file sum.rar về máy theo đường dẫn: https://drive.google.com/open?id=16DT0_Pme3s-mB6rhgFjNOCsV_DLyIviE

Quy trình cài đặt phần mềm cho khách hàng

B1: copy file sum.rar vào bất kì ổ đĩa nào trên máy khách hàng mà khách hàng mong muốn ở đây mình mặc định là cài ở ổ đĩa D

B2: Giải nén phần mềm.

B3: Nếu là cài ở đĩa D(và không nằm trong folder nào khác) thì hãy thêm đường dẫn D:\sum vào biến môi trường path

B4: Mở cmd và gõ dòng lệnh sum 2766(đây là số bất kỳ bạn muốn gõ) 8uuu(đây cũng là số bất kỳ bạn muốn)

Nếu như là muốn cài phần mềm ở ổ đĩa khác không phải là ở đĩa D hay trong folder nào đó thì hãy làm theo các bước sau đây:

B1: copy file sum.rar vào ổ đĩa mà khách hàng mong muốn (Ví dụ: E:/NewFile)

B2: Giải nén file sum.rar

B3: Click chuột phải vào file sum.cmd trong file sum và chọn edit và sửa lại code như sau: java -jar E:/NewFile/sum/MyBigNumber-0.0.1-SNAPSHOT.jar %1 %2

B4: Thêm đường dẫn E:\NewFile\sum vào biến môi trường path

B5: Mở cmd và gõ dòng lệnh sum 23232( số bất kỳ bạn muốn gõ) 8899( số bất kỳ bạn muốn)

Cách sử dụng phần mềm

B1: Nhập số thứ nhất vào ô bên cạnh phía bên phải dòng chữ "The First Number"

B2: Nhập số thứ hai vào ô bên cạnh phía bên phải dòng chữ "The Second Number"

B3: Nhấn nút submit để thực hiện phép toán. Kết quả sẽ in ra trong ô sát bên phải dòng chữ Result, và các bước hướng dẫn in ra trong ô nằm bên phải của app.

B4: Nhấn nút Clean để xóa dữ liệu có trong khung nhập và thực hiện lại từ đầu (bước 1) để cộng 2 số khác (nếu muốn).

Các lỗi thường gặp phải khi sử dụng phần mềm và phải tránh các trường hợp sau đây:

2 chuỗi số nhập vào KHÔNG ĐƯỢC chứa chữ. Ví dụ: s1 = 12A và s2 = atr2 || hay s1 = 6523 và s2 = 45ty4 || hay s1 = akfg23 và s2 = 23

2 chuỗi số nhập vào KHÔNG ĐƯỢC chứa số âm. Ví dụ: s1 = -32 và s2 = 123 || hay s1 = 76767 và s2 =-672 || hay s1 = -2672 và s2 = -878

2 chuỗi nhập vào KHÔNG ĐƯỢC chứa kí tự đặc biệt. ví dụ: s1 = %233 và s2 = 42^$% || hay s1 = 33433 và s2 = 34$ || hay s1 = $#$2 và s2 = 1111======================================
