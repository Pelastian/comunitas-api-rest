INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('sacunam', '$2a$10$Cw9wt3RoGyB1nnUs/o28yOd3yuFz4x3MS3GYcZ8MsbHRLL/lNFlH6', true, 'Sebastián', 'Acuña', 'sacunam@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('jlufin', '$2a$10$lHJYRVoh6/5flhk0dFkL8OqfhZY001rSYliw0TBd6RWSmmagRA6uO', true, 'Jorge', 'Lufín', 'conserjeria.cibercentro@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('esanchez', '$2a$10$nAfydjCAa7lASNqWVLU8XewOj7JNBZGBzsgRI83c.kOZKnTUH/bNy', true, 'Edgar', 'Sánchez', 'es651259@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('jsandoval', '$2a$10$fODE1/2nQTAzbFaJ6ifQFOX7gcqoV3zvJ1lHc5lm7c4SFeNmDdyDi', true, 'Julio', 'Sandoval', 'sacunam@hotmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('marroyo', '$2a$10$fODE1/2nQTAzbFaJ6ifQFOX7gcqoV3zvJ1lHc5lm7c4SFeNmDdyDi', true, 'Julio', 'Sandoval', 'maav.74@gmail.com');


INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');
INSERT INTO roles (nombre) VALUES ('ROLE_MAYORDOMO');
INSERT INTO roles (nombre) VALUES ('ROLE_EMPLEADO');
INSERT INTO roles (nombre) VALUES ('ROLE_VECINO');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 3);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (3, 3);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 4);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (4, 4);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (5, 4);