-- ----------------------------
-- 1. 窗户设计表
-- ----------------------------
drop table if exists window_design;
create table window_design (
  id varchar(36) not null comment '设计ID',
  name varchar(100) not null comment '设计名称',
  width double(10,2) not null comment '宽度',
  height double(10,2) not null comment '高度',
  frame_size double(10,2) not null comment '框架尺寸',
  thumbnail text comment '缩略图（Base64）',
  design_data text comment '设计数据（JSON）',
  create_time datetime default current_timestamp comment '创建时间',
  update_time datetime default current_timestamp on update current_timestamp comment '更新时间',
  create_by varchar(64) default '' comment '创建者',
  update_by varchar(64) default '' comment '更新者',
  remark varchar(500) default null comment '备注',
  primary key (id)
) engine=innodb comment = '窗户设计表';

-- ----------------------------
-- 2. 菜单权限配置
-- ----------------------------
-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('窗户设计管理', '1', '10', 'design', 'system/design/index', 0, 0, 'C', '0', '0', 'system:design:list', 'tool', 'admin', sysdate(), '', null, '窗户设计管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('窗户设计查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:design:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('窗户设计新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:design:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('窗户设计修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:design:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('窗户设计删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:design:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('窗户设计导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:design:export',       '#', 'admin', sysdate(), '', null, ''); 