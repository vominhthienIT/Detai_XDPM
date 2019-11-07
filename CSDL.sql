﻿select * from Resevation where titleID = '1112'
select * from Customer

use XayDungPhanMem

--Customer

insert into Customer values('111','Đồng Tháp','Nguyễn Văn Tình','0932444111')
insert into Customer values('112','Lâm Đồng','Nguyễn Thị Hoa','0932444222')
insert into Customer values('113','Sóc Trăng','Nguyễn Văn Hóa','0932444333')
insert into Customer values('114','Ba Tri','Nguyễn Tri Tôn','0932444444')
insert into Customer values('115','Đồng Nai','Nguyễn Trần Huy Hoàng','0932444555')
insert into Customer values('116','Kiêng Giang','Nguyễn Văn Huy','0932444666')
insert into Customer values('117','Phú Quốc','Ngô Sĩ Đức','0932444777')
insert into Customer values('118','Hà Tĩnh','Nguyễn Trần Thy Ân','0932444888')
insert into Customer values('119','Nghệ An','Võ Đình Chơn','0932444999')
insert into Customer values('120','Hà Tây','Fan Melissa','0932444000')
insert into Customer values('121','Tri Tôn','Võ Sĩ Luân','0932111333')
insert into Customer values('122','Hồ Chí Minh','Nguyễn Văn Hiếu','0932222333')
insert into Customer values('123','Sóc Trăng','Trần Thanh Hòa','0932333333')
insert into Customer values('124','Tịnh Thới','Võ Xuân Tùng','0932444333')
insert into Customer values('125','Trà Ôn','Võ Huỳnh Bảo Khương','0932555333')
insert into Customer values('126','Vĩnh Long','Nguyễn Anh Tuấn','0932666333')
insert into Customer values('127','Sơn La','Nguyễn Thành Đạt','0932777333')
insert into Customer values('128','Lâm Đồng','Huỳnh Thanh Lâm','0932888333')
insert into Customer values('129','Gò Vấp','Trần Bảo Hòa','0932999333')
insert into Customer values('130','Cần Thơ','Vũ Trung Kiên','0911000333')
insert into Customer values('131','Dương Quảng Hàm','Trần Ngọc Đan Thanh','0922444333')
insert into Customer values('132','Nguyễn Văn Lượng','Dương Thị Cẩm Tú','0933444333')
insert into Customer values('133','Phạm Văn Đồng','Trương Quốc Minh','0944444333')
insert into Customer values('134','Phạm Văn Chiêu','Trần Gia Bảo','0955444333')
insert into Customer values('135','Cây Gõ','Trần Nhật Trường','0966444333')
insert into Customer values('136','Long An','Mai Thanh Tiến','0977444333')
insert into Customer values('137','Phú Yên','Nguyễn Quốc Huy','0882444333')
insert into Customer values('138','Sa Đéc','Nguyễn Văn Tình','0999444333')
insert into Customer values('139','Tháp Mười','Nguyễn Văn Tình','0900444333')
insert into Customer values('140','Cao Lãnh','Nguyễn Văn Tình','0932134333')

--Title
Select * from Title
delete from Title where titleID = '1113'

insert into Title values('210','Đi Tìm Neemo')
insert into Title values('211','Trong Từng Nhịp Thở')
insert into Title values('212','Mất Tích Ở Berlin')
insert into Title values('213','50 Sắc Thái Đen')
insert into Title values('214','Người Du Hành')
insert into Title values('215','Liên Minh Sát Thủ')
insert into Title values('216','24 Giờ Yêu')
insert into Title values('217','Ánh Đèn Giữa Hai Đại Dương')
insert into Title values('218','Những Kẻ Mộng Mơ')
insert into Title values('219','Trước Ngày Em Đến')
insert into Title values('220','Người Đẹp Và Quái Vật')
insert into Title values('221','Người Thứ 3')
insert into Title values('222','Kỳ Nghĩ Chết Người')
insert into Title values('223','Tuyên Ngôn Độc Thân')
insert into Title values('224','Sắc Đẹp Vĩnh Cửu')
insert into Title values('225','Nơi Cuối Cầu Vồng')
insert into Title values('226','Duyên Vội')
insert into Title values('227','Yêu Lại Từ Đầu')
insert into Title values('228','Người Tình Bí Ẩn')
insert into Title values('229','Chuyện Tình Mùa Đông')
insert into Title values('230','Tình Yêu Bất Tận')
insert into Title values('231','Mặt Trời Giữa Đêm')
insert into Title values('232','Cơn Sốt Hoa')
insert into Title values('233','Trên Bãi Biển Chesil')
insert into Title values('234','Thuyết Yêu Thương')
insert into Title values('235','Ánh Dương Bất Tận')
insert into Title values('236','Lựa Chọn Của Trái Tim')
insert into Title values('237','Pokemon')
insert into Title values('238','Doraemon')
insert into Title values('239','7 Viên Ngọc Rồng')

--Disk
select * from Disks
delete from Disks where diskID='112'

insert into Disks values('310','Tập 1-2','On Hold','001','210')
insert into Disks values('311','Tập 3-4','On Shelves','001','210')
insert into Disks values('312','Tập 5-6','On Hold','001','210')
insert into Disks values('313','Tập 7-8','Rented','001','210')
insert into Disks values('314','Tập 9-10','On Rented','001','210')

insert into Disks values('315','Tập 1-2','On Hold','001','211')
insert into Disks values('316','Tập 3-4','On Shelves','001','211')
insert into Disks values('317','Tập 5-6','On Hold','001','211')
insert into Disks values('318','Tập 7-8','Rented','001','211')
insert into Disks values('319','Tập 9-10','On Hold','001','211')

insert into Disks values('320','Tập 1-2','On Hold','001','212')
insert into Disks values('321','Tập 3-4','On Hold','001','212')
insert into Disks values('322','Tập 5-6','On Shelves','001','212')
insert into Disks values('323','Tập 7-8','On Hold','001','212')
insert into Disks values('324','Tập 9-10','On Hold','001','212')

insert into Disks values('325','Tập 1-2','On Hold','001','213')
insert into Disks values('326','Tập 3-4','On Shelves','001','213')
insert into Disks values('327','Tập 5-6','On Hold','001','213')
insert into Disks values('328','Tập 7-8','On Hold','001','213')
insert into Disks values('329','Tập 9-10','On Hold','001','213')

insert into Disks values('330','Tập 1-2','On Shelves','001','214')
insert into Disks values('331','Tập 3-4','On Shelves','001','214')
insert into Disks values('332','Tập 5-6','On Shelves','001','214')
insert into Disks values('333','Tập 7-8','On Hold','001','214')
insert into Disks values('334','Tập 9-10','Rented','001','214')

insert into Disks values('335','Tập 1-2','On Shelves','001','215')
insert into Disks values('336','Tập 3-4','On Shelves','001','215')
insert into Disks values('337','Tập 5-6','On Hold','001','215')
insert into Disks values('338','Tập 7-8','On Rented','001','215')
insert into Disks values('339','Tập 9-10','On Shelves','001','215')

--Reservation

select * from Resevation
insert into Resevation values('410','2019-04-03','111','210')
insert into Resevation values('411','2019-04-03','112','211')
insert into Resevation values('412','2019-05-04','113','212')
insert into Resevation values('413','2019-05-04','114','213')
insert into Resevation values('414','2019-06-05','115','214')
insert into Resevation values('415','2019-06-05','116','215')
insert into Resevation values('416','2019-07-06','117','216')
insert into Resevation values('417','2019-07-06','118','217')
insert into Resevation values('418','2019-08-07','119','210')
insert into Resevation values('419','2019-08-07','111','211')
insert into Resevation values('420','2019-09-08','112','212')
insert into Resevation values('421','2019-09-08','113','213')
insert into Resevation values('422','2019-10-09','114','214')
insert into Resevation values('423','2019-10-09','115','215')
insert into Resevation values('424','2019-11-10','116','216')
insert into Resevation values('425','2019-01-10','117','217')
insert into Resevation values('426','2019-01-11','118','211')
insert into Resevation values('427','2019-03-11','119','212')
insert into Resevation values('428','2019-04-12','111','213')
insert into Resevation values('429','2019-05-12','112','214')
insert into Resevation values('430','2019-06-13','113','215')
insert into Resevation values('431','2019-07-13','114','216')
insert into Resevation values('432','2019-08-14','115','217')
insert into Resevation values('433','2019-09-14','116','211')
insert into Resevation values('434','2019-10-15','117','212')
insert into Resevation values('435','2019-01-15','118','213')
insert into Resevation values('436','2019-02-16','119','214')
insert into Resevation values('437','2019-03-16','115','215')
insert into Resevation values('438','2019-04-17','116','216')
insert into Resevation values('439','2019-05-17','117','217')