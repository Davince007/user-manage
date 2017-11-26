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
    addr_isDefaultAddr varchar(1) not null comment '是否为默认地址',
    createUser varchar(15) default null comment '创建人',
    createDate varchar(8) default null comment '创建日期',
    createTime varchar(8) default null comment '创建时间',
    updateUser varchar(15) default null comment '修改人',
    updateDate varchar(8) default null comment '创建日期',
    updateTime varchar(8) default null comment '更新时间'
)engine=InnoDB default charset=utf8 comment '用户地址表';

insert into um_address() values(1,'123456','420101199001011234','2','13100001111','Jack','广东省','深圳市','福田区','福强路','益田村113栋004G室','123456@qq.com','1','Jack','','','Jack','','');
drop table um_user;
create table um_user(
	user_uiid varchar(32) not null primary key comment '用户主键',
    user_name varchar(200) not null comment '用户姓名',
    user_passwd varchar(32) not null comment '用户密码',
    user_phone varchar(32) not null comment '用户手机',
    user_idNumber varchar(32) not null comment '证件号码',
    user_idType varchar(32) not null comment '证件类型 1-15位身份证 2-18位身份证 3-军官证 4-港澳台通行证 5-居住证',
    user_uLevel varchar(32) null default null comment '客户等级 1-注册用户 2-实名用户',
    user_source varchar(32) null default null comment '客户来源',
    user_education varchar(32) null default null comment '教育程度 1-小学以下 2-初中以下 3-高中以下 4-大学本科以下 5-硕士研究生以下 6-博士',
    user_department varchar(32) null default null comment '所在单位',
    user_position varchar(32) null default null comment '职位',
    user_sex varchar(2) null default null comment '性别 0-女 1-男',
    user_email varchar(32) null default null comment '用户邮箱',
    user_birthday varchar(32) null default null comment '用户生日',
    user_province varchar(32) null default null comment '省份',
    user_city varchar(32) null default null comment '城市',
    user_county varchar(32) null default null comment '区（县）',
    user_town varchar(32) null default null comment '街道（镇）',
    user_address varchar(32) null default null comment '详细地址',
    zipCode varchar(10) null default null comment '邮编',
    createUser varchar(15) default null comment '创建人',
    createDate varchar(8) default null comment '创建日期',
    createTime varchar(8) default null comment '创建时间',
    updateUser varchar(15) default null comment '修改人',
    updateDate varchar(8) default null comment '创建日期',
    updateTime varchar(8) default null comment '更新时间'
)engine=InnoDB default charset=utf8 comment '用户信息表';

drop table um_register;
create table um_register(
	register_id bigint not null primary key auto_increment comment '注册表主键',
	register_uiid varchar(32) not null comment '用户信息表主键',
    register_name varchar(200) not null comment '用户姓名',
    register_phone varchar(11) not null comment '手机号码',
    register_passwd varchar(20) not null comment '用户密码',
    register_idNumber varchar(32) not null comment '证件号码',
    register_idType varchar(32) not null comment '证件类型 1-15位身份证 2-18位身份证 3-军官证 4-港澳台通行证 5-居住证',
    register_email varchar(50) not null comment '电子邮箱',
	register_sex varchar(2) null default null comment '性别 0-女 1-男',
    register_birthday varchar(32) null default null comment '用户生日',
    register_province varchar(32) null default null comment '省份',
    register_city varchar(32) null default null comment '城市',
    register_county varchar(32) null default null comment '区（县）',
    register_town varchar(32) null default null comment '街道（镇）',
    register_address varchar(32) null default null comment '详细地址',
    zipCode varchar(10) null default null comment '邮编',
    createUser varchar(15) default null comment '创建人',
    createDate varchar(8) default null comment '创建日期',
    createTime varchar(8) default null comment '创建时间',
    updateUser varchar(15) default null comment '修改人',
    updateDate varchar(8) default null comment '创建日期',
    updateTime varchar(8) default null comment '更新时间'
)engine=InnoDB default charset=utf8 comment '用户注册表';
