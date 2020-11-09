DELETE FROM user_roles;
DELETE FROM meals;
DELETE FROM users;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password'),
       ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id)
VALUES ('USER', 100000),
       ('ADMIN', 100001);

INSERT INTO meals (user_id, dateTime, description, calories)
VALUES (100000, '2020-11-09 12:00:00', 'Еда для user 1', 550),
       (100000, '2020-11-09 16:00:00', 'Еда для user 2', 650),
       (100000, '2020-11-09 20:00:00', 'Еда для user 3', 100),
       (100001, '2020-11-09 12:00:00', 'Еда для admin 1', 1000),
       (100001, '2020-11-09 15:40:00', 'Еда для admin 2', 900),
       (100001, '2020-11-09 21:00:00', 'Еда для admin 3', 100)
;