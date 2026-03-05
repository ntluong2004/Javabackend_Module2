-- Tạo một database (schema) với tên store_management.
-- Tạo bảng product với các trường sau:
--  + id: khóa chính, tự động tăng.
--  + name: NOT NULL.
--  + description: có thể để NULL.
--  + price: có thể để NULL.
--  + stock: có thể để NULL.
create database store_managerment;

use store_managerment;
create table product (
id int primary key auto_increment,
product_name varchar(50) not null,
descrip varchar(255) null,
price double null,
quantity int null
);

-- Chèn dữ liệu vào bảng product qua 4 phương pháp: 
-- a. Thao tác trực tiếp trên giao diện workbench. 
-- b. Sử dụng lệnh mà không chỉ định tên cột. 
-- c. Sử dụng lệnh và chỉ định rõ tên cột. 
-- d. Sử dụng lệnh, chỉ định rõ tên cột và không nhập dữ liệu cho các cột cho phép NULL.
insert into product 
values (null, 'Chuot may tinh2', 'Dung de dieu khien may tinhs', 2500000.0, 10);

insert into product (product_name, descrip, price, quantity)
values ('Ban phim gamming5', 'dung de choi game', 8760883374.0, 100);

insert into product (product_name)
values ('Ban phim gamming1');

-- Truy Vấn Dữ Liệu:
-- Liệt kê toàn bộ thông tin của product.
-- Liệt kê id, name, và price của tất cả sản phẩm.
-- Liệt kê id, name, và price của các sản phẩm có giá dưới 10 triệu.
select * from product;

select id, product_name, price
from product;

select id, product_name, price 
from product
where price < 10000000;

-- a. Thao tác trực tiếp trên giao diện workbench.
-- b. Sử dụng lệnh mà không có điều kiện WHERE.
-- c. Sử dụng lệnh với điều kiện WHERE. 
set sql_safe_updates = 0;
update product
set price = 0;
set sql_safe_updates = 1;

update product
set product_name = 'ngon luon'
where id = 2;


-- Chỉnh sửa cấu trúc bảng bằng cách
-- a. Thêm trường Barcode với tất cả dữ liệu từ trước là NULL 
-- b. Thêm trường Warranty với giá trị mặc định là 6 tháng.

alter table product
add barcode varchar(255) null;

alter table product
add warranty int default 6;

-- Xóa dữ liệu trên bảng qua 3 phương pháp:
-- a. Thao tác trực tiếp trên giao diện workbench.
-- b. Sử dụng lệnh mà không có điều kiện WHERE.
-- c. Sử dụng lệnh với điều kiện WHERE.
delete from product;
delete from product where id=1;

-- Xóa Bảng
-- Thực hiện DROP bảng product
drop table product;

-- Xóa cơ sở dữ liệu bằng 2 cách:
-- a. Xóa mà không có điều kiện (Lỗi xảy ra nếu database không tồn tại).
-- b. Xóa bằng cách kiểm tra database đã tồn tại chưa rồi tiến hành xóa.
drop database store_managerment;
drop database if exists store_managerment;

