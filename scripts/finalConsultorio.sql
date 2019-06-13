INSERT INTO rol(idrol, nombrerol) VALUES(1, 'administrador');
INSERT INTO rol(idrol, nombrerol) VALUES(2, 'medico');
INSERT INTO rol(idrol, nombrerol) VALUES(3, 'paciente');
INSERT INTO especialidad(idespecialidad, nombreespecialidad) VALUES(1, 'Traumatología');
INSERT INTO especialidad(idespecialidad, nombreespecialidad) VALUES(2, 'Neurología');
INSERT INTO especialidad(idespecialidad, nombreespecialidad) VALUES(3, 'Medicina General');
INSERT INTO especialidad(idespecialidad, nombreespecialidad) VALUES(4, 'Fisiatría');
INSERT INTO consultorio(idconsultorio, numconsultorio, lugarconsultorio) VALUES (1, 101, 'Primer piso');
INSERT INTO consultorio(idconsultorio, numconsultorio, lugarconsultorio) VALUES (2, 102, 'Primer piso');
INSERT INTO consultorio(idconsultorio, numconsultorio, lugarconsultorio) VALUES (3, 103, 'Primer piso');
INSERT INTO persona(idpersona, primernombre, segundonombre, primerapellido, segundoapellido, celular, clave, correo, idrol) VALUES (1, 'Edwin', 'Santiago', 'Puco', 'Zapata', '0984368571', 'admin', 'edwin22@live.com', 1);
INSERT INTO persona(idpersona, primernombre, segundonombre, primerapellido, segundoapellido, celular, clave, correo, idrol) VALUES (2, 'Ginger', 'Katherine', 'Sipión', 'Coloma', '', 'admin', 'gksipion@uce.edu.ec', 1);
INSERT INTO persona(idpersona, primernombre, segundonombre, primerapellido, segundoapellido, celular, clave, correo, idrol) VALUES (3, 'Raúl', '', 'Paredes', '', '0987654321', 'rparedes', 'rparedes@live.com', 2);
INSERT INTO persona(idpersona, primernombre, segundonombre, primerapellido, segundoapellido, celular, clave, correo, idrol) VALUES (4, 'María', 'Alejandra', 'Cuesta', '', '0987654673', 'usuario', 'usuario@live.com', 3);
INSERT INTO persona(idpersona, primernombre, segundonombre, primerapellido, segundoapellido, celular, clave, correo, idrol) VALUES (5, 'Rosa', '', 'Garcia', '', '0964534568', 'rgarcia', 'rgarcia@live.com', 2);
INSERT INTO persona(idpersona, primernombre, segundonombre, primerapellido, segundoapellido, celular, clave, correo, idrol) VALUES (6, 'Marco', '', 'Pérez', '', '0984357373', 'mperez', 'mperez@live.com', 2);
INSERT INTO persona(idpersona, primernombre, segundonombre, primerapellido, segundoapellido, celular, clave, correo, idrol) VALUES (7, 'David', '', 'Montoya', 'Castillo', '0975463728', 'dmontoya', 'dmontoya@live.com', 3);
INSERT INTO persona(idpersona, primernombre, segundonombre, primerapellido, segundoapellido, celular, clave, correo, idrol) VALUES (8,'Betsabé','del Pilar','Zapata','Salgado','','pilar','pilar@hotmail.com',3);
INSERT INTO paciente(fechanacimiento, citarealizada, citacancelada, idpaciente) VALUES ('1994-02-10', 0, 0, 4);
INSERT INTO paciente(fechanacimiento, citarealizada, citacancelada, idpaciente) VALUES ('2000-01-12', 0, 0, 7);
INSERT INTO paciente(fechanacimiento, citarealizada, citacancelada, idpaciente) VALUES ('1996-12-12', 0, 0, 8);
INSERT INTO medico(calificacionmedico, fichamedica, idespecialidad, idmedico, idconsultorio, experiencia, precioconsulta)  VALUES (5, 'Soy un traumatologo', 1, 3, 1, 5, 20.0);
INSERT INTO medico(calificacionmedico, fichamedica, idespecialidad, idmedico, idconsultorio, experiencia, precioconsulta) VALUES (5, 'Soy una fisiatra', 4, 5, 2, 4, 10.0);
INSERT INTO medico(calificacionmedico, fichamedica, idespecialidad, idmedico, idconsultorio, experiencia, precioconsulta) VALUES (5, 'Soy un reurologo', 2, 6, 3, 4, 5.0);
INSERT INTO tipoestablecimiento(idtipoestablecimiento, tipoestablecimiento) VALUES (1, 'Hospital');
INSERT INTO tipoestablecimiento(idtipoestablecimiento, tipoestablecimiento) VALUES (2, 'Clínica');
INSERT INTO tipoestablecimiento(idtipoestablecimiento, tipoestablecimiento) VALUES (3, 'A domicilio');
INSERT INTO tipoestablecimiento(idtipoestablecimiento, tipoestablecimiento) VALUES (4, 'Farmacia');
INSERT INTO tipoestablecimiento(idtipoestablecimiento, tipoestablecimiento) VALUES (5, 'Laboratorio');
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (1,'Hospital Voz Andes','023456534', '00:15:00', 1);
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (2,'Hospital Un canto a la vida','023534321', '00:20:00', 1);
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (3,'Clínica de la mujer','', '00:20:00', 2);
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (4,'Dr. Piesito','034543245', null , 3);
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (5,'Curación Total','022222224', null,3);
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (6,'Farmared','', null, 4);
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (7,'Sana Sana','',null, 4);
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (8,'Farmacias Económicas','',null,4);
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (9,'Biolab','',null,5);
INSERT INTO establecimiento(idestablecimiento, nombreestablecimiento, telefonoestablecimiento, tiempoatencionmedico, idtipoestablecimiento) VALUES (10,'Laboratorio ','',null,5);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (1,'Av. america y colón',1);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (2,'Av. Rodrigo de chavez y 5 de junio',1);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (3,'Av. solanda',2);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (4,'Juan leon mera y ascaray',3);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (5,'Av ajaví',4);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (6,'Miraflores',5);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (7,'Gran aki solanda',6);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (8,'Quito sur',6);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (9,'Aki solanda',7);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (10,'Centro comercial Atahualpa',7);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (11,'Villaflora',8);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (12,'El labrador',9);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (13,'Centro historico',9);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (14,'Guamani',10);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (15,'Psje. Oe4I y Av. Ajaví S16-19',null);
INSERT INTO direccion(iddireccion, direccion, idestablecimiento) VALUES (16,'Av. universitaria',null);
INSERT INTO ubicacion(iddireccion, idpaciente) VALUES (15, 4);
INSERT INTO ubicacion(iddireccion, idpaciente) VALUES (15, 7);
INSERT INTO ubicacion(iddireccion, idpaciente) VALUES (16, 8);
INSERT INTO disponibilidad(idmedico, idestablecimiento, dia, horainicio, horafin) VALUES(3, 2, 'lunes', '07:00:00', '11:00:00');
INSERT INTO disponibilidad(idmedico, idestablecimiento, dia, horainicio, horafin) VALUES(5, 3, 'martes', '07:00:00', '09:00:00');
INSERT INTO disponibilidad(idmedico, idestablecimiento, dia, horainicio, horafin) VALUES(6, 1, 'miércoles', '14:00:00', '18:00:00');
INSERT INTO cita(idcita, fechagenerada, fechacita, horacitainicio, estadocita, calificacioncita, confirmacioncita, horacitafinal, idpaciente, idmedico, idestablecimiento, dia) VALUES (1, '01-06-2019', '06-06-2019', '07:00:00', 1, 5, 1, '07:30:00', 4, 3, 1, 'martes');
INSERT INTO cita(idcita, fechagenerada, fechacita, horacitainicio, estadocita, calificacioncita, confirmacioncita, horacitafinal, idpaciente, idmedico, idestablecimiento, dia) VALUES (2, '01-06-2019', '06-06-2019', '17:00:00', 1, 5, 1, '18:00:00', 7, 6, 4, 'miércoles');
INSERT INTO cita(idcita, fechagenerada, fechacita, horacitainicio, estadocita, calificacioncita, confirmacioncita, horacitafinal, idpaciente, idmedico, idestablecimiento, dia) VALUES (3, '02-06-2019', '06-06-2019', '07:30:00', 1, 5, 1, '08:00:00', 8, 3, 1, 'martes');
