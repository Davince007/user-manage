use usermanage;
drop table um_address;
create table um_address(
	addr_Id bigint primary key not null auto_increment comment '主键',
    addr_uiid varchar(32) not null comment '用户信息表主键',
    addr_idNumber varchar(20) not null comment '证件号码',
    addr_idType varchar(2) not null comment '证件类型',
    addr_phone varchar(11) not null comment '手机号码',
    addr_consignee varchar(15) not null comment '收货人',
    addr_province varchar(15) not null comment '省份',
    addr_city varchar(15) not null comment '市',
    addr_county varchar(15) null comment '区（县）',
    addr_town varchar(15) null comment '街道（镇）',
    addr_detailAddr varchar(120) not null comment '详细地址',
    addr_email varchar(45) not null comment '收件人邮箱',
    addr_isDefaultAddr varchar(1) not null  comment '是否为默认地址',
    addr_createTime timestamp null default current_timestamp comment '创建时间',
    addr_updateTime timestamp null default current_timestamp on update current_timestamp comment '更新时间'
);

insert into um_address value(1,'123','420101199001019091','1','13100001111','Jack','广东省','深圳市','福田区','福强路','益田村113栋004G室','772583372@qq.com','Y',current_timestamp(),current_timestamp());
select * from um_address;
select * from um_address where 1=1 and addr_uiid = '123' order by addr_createTime desc ;