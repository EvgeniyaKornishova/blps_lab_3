insert into privilege (id, name) values (1, 'READ_PRIVILEGE');
insert into privilege (id, name) values (2, 'WRITE_PRIVILEGE');
insert into role (id, name) values (1, 'ROLE_ADMIN');
insert into role (id, name) values (2, 'ROLE_USER');
insert into roles_privileges (role_id, privilege_id) values (1, 1);
insert into roles_privileges (role_id, privilege_id) values (1, 2);
insert into roles_privileges (role_id, privilege_id) values (2, 1);
insert into users (password, username, violations_count) values ('$2a$10$INAUdpyE3O.Ju2MfsUdMEOwgWn2wFmwUS7IwIO5iTf0GhQjx.zs9W', 'admin', 0);
insert into users_roles (user_id, role_id) values (1, 1);
insert into equities (ask, bid, extended_hours, high, last, low, name, next_earning_date, open, prev, symbol, time, vol) values (2.3, 1.2, 1.5, 1.4, 1.2, 1.1, 'Yandex', DATE '11.12.2021', 1.2, 1.2, 'YNDX', TIME '11:20', 300000);
insert into equities (ask, bid, extended_hours, high, last, low, name, next_earning_date, open, prev, symbol, time, vol) values (1.3, 1.2, 1.5, 1.4, 1.2, 1.1, 'Google', DATE '11.12.2021', 1.2, 1.2, 'GGL', TIME '11:20', 300000);
insert into equities (ask, bid, extended_hours, high, last, low, name, next_earning_date, open, prev, symbol, time, vol) values (1.3, 1.2, 1.5, 1.4, 1.2, 1.1, 'Mailru', DATE '11.12.2021', 1.2, 1.2, 'MLRU', TIME '11:20', 300000);
insert into equities (ask, bid, extended_hours, high, last, low, name, next_earning_date, open, prev, symbol, time, vol) values (1.3, 1.2, 1.5, 1.4, 1.2, 1.1, 'Gazprom', DATE '11.12.2021', 1.2, 1.2, 'GPRM', TIME '11:20', 300000);
insert into equities (ask, bid, extended_hours, high, last, low, name, next_earning_date, open, prev, symbol, time, vol) values (2.3, 1.2, 1.5, 1.4, 1.2, 1.1, 'Volchek', DATE '11.12.2021', 1.2, 1.2, 'VLCH', TIME '11:20', 300000);
insert into equities (ask, bid, extended_hours, high, last, low, name, next_earning_date, open, prev, symbol, time, vol) values (1.3, 1.2, 1.5, 1.4, 1.2, 1.1, 'Tseh85', DATE '11.12.2021', 1.2, 1.2, 'TS85', TIME '11:20', 300000);
insert into equities (ask, bid, extended_hours, high, last, low, name, next_earning_date, open, prev, symbol, time, vol) values (1.3, 1.2, 1.5, 1.4, 1.2, 1.1, 'Toshiba', DATE '11.12.2021', 1.2, 1.2, 'TSHB', TIME '11:20', 300000);