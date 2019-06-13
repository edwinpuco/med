CREATE TABLE cita
(
	idCita               INTEGER NOT NULL,
	fechaGenerada        TIMESTAMP NULL,
	fechaCita            DATE NULL,
	horaCitaInicio       TIME NULL,
	estadoCita           BOOLEAN NULL,
	calificacionCita     INTEGER NULL,
	confirmacionCita     BOOLEAN NULL,
	horaCitaFinal        TIME NULL,
	idPaciente           INTEGER NOT NULL,
	idMedico             INTEGER NOT NULL,
	idEstablecimiento    INTEGER NOT NULL,
	dia                  VARCHAR(9) NOT NULL
);

ALTER TABLE cita
ADD PRIMARY KEY (idCita,idPaciente,idMedico,idEstablecimiento,dia);

CREATE TABLE consultorio
(
	idConsultorio        INTEGER NOT NULL,
	numConsultorio       INTEGER NULL,
	lugarConsultorio     VARCHAR(50) NULL
);

ALTER TABLE consultorio
ADD PRIMARY KEY (idConsultorio);

CREATE TABLE direccion
(
	idDireccion          INTEGER NOT NULL,
	direccion            VARCHAR(200) NULL,
	idEstablecimiento    INTEGER NULL
);

ALTER TABLE direccion
ADD PRIMARY KEY (idDireccion);

CREATE TABLE disponibilidad
(
	dia                  VARCHAR(9) NOT NULL,
	horaInicio           TIME NULL,
	horaFin              TIME NULL,
	idMedico             INTEGER NOT NULL,
	idEstablecimiento    INTEGER NOT NULL
);

ALTER TABLE disponibilidad
ADD PRIMARY KEY (idMedico,idEstablecimiento,dia);

CREATE TABLE especialidad
(
	idEspecialidad       INTEGER NOT NULL,
	nombreEspecialidad   VARCHAR(50) NULL
);

ALTER TABLE especialidad
ADD PRIMARY KEY (idEspecialidad);

CREATE TABLE establecimiento
(
	idEstablecimiento    INTEGER NOT NULL,
	nombreEstablecimiento VARCHAR(100) NULL,
	telefonoEstablecimiento VARCHAR(10) NULL,
	idTipoEstablecimiento INTEGER NULL,
	tiempoAtencionMedico TIME NULL
);

ALTER TABLE establecimiento
ADD PRIMARY KEY (idEstablecimiento);

CREATE TABLE medico
(
	calificacionMedico   INTEGER NULL,
	fichaMedica          VARCHAR(200) NULL,
	idEspecialidad       INTEGER NULL,
	idMedico             INTEGER NOT NULL,
	experiencia          INTEGER NULL,
	precioConsulta       FLOAT NULL,
	idConsultorio        INTEGER NULL
);

ALTER TABLE medico
ADD PRIMARY KEY (idMedico);

CREATE TABLE paciente
(
	fechaNacimiento      DATE NULL,
	citaRealizada        INTEGER NULL,
	citaCancelada        INTEGER NULL,
	idPaciente           INTEGER NOT NULL
);

ALTER TABLE paciente
ADD PRIMARY KEY (idPaciente);

CREATE TABLE persona
(
	idPersona            INTEGER NOT NULL,
	primerNombre         VARCHAR(25) NULL,
	segundoNombre        VARCHAR(25) NULL,
	primerApellido       VARCHAR(25) NULL,
	segundoApellido      VARCHAR(25) NULL,
	celular              VARCHAR(10) NULL,
	clave                VARCHAR(25) NULL,
	correo               VARCHAR(50) NULL,
	idRol                INTEGER NULL
);

ALTER TABLE persona
ADD PRIMARY KEY (idPersona);

CREATE TABLE rol
(
	idRol                INTEGER NOT NULL,
	nombreRol            VARCHAR(50) NULL
);

ALTER TABLE rol
ADD PRIMARY KEY (idRol);

CREATE TABLE tipoEstablecimiento
(
	idTipoEstablecimiento INTEGER NOT NULL,
	tipoEstablecimiento  VARCHAR(11) NULL
);

ALTER TABLE tipoEstablecimiento
ADD PRIMARY KEY (idTipoEstablecimiento);

CREATE TABLE ubicacion
(
	idDireccion          INTEGER NOT NULL,
	idPaciente           INTEGER NOT NULL
);

ALTER TABLE ubicacion
ADD PRIMARY KEY (idDireccion,idPaciente);

ALTER TABLE cita
ADD CONSTRAINT R_47 FOREIGN KEY (idPaciente) REFERENCES paciente (idPaciente);

ALTER TABLE cita
ADD CONSTRAINT R_48 FOREIGN KEY (idMedico, idEstablecimiento, dia) REFERENCES disponibilidad (idMedico, idEstablecimiento, dia);

ALTER TABLE direccion
ADD CONSTRAINT R_19 FOREIGN KEY (idEstablecimiento) REFERENCES establecimiento (idEstablecimiento);

ALTER TABLE disponibilidad
ADD CONSTRAINT R_40 FOREIGN KEY (idMedico) REFERENCES medico (idMedico);

ALTER TABLE disponibilidad
ADD CONSTRAINT R_41 FOREIGN KEY (idEstablecimiento) REFERENCES establecimiento (idEstablecimiento);

ALTER TABLE establecimiento
ADD CONSTRAINT R_23 FOREIGN KEY (idTipoEstablecimiento) REFERENCES tipoEstablecimiento (idTipoEstablecimiento);

ALTER TABLE medico
ADD CONSTRAINT R_4 FOREIGN KEY (idEspecialidad) REFERENCES especialidad (idEspecialidad);

ALTER TABLE medico
ADD CONSTRAINT R_38 FOREIGN KEY (idMedico) REFERENCES persona (idPersona);

ALTER TABLE medico
ADD CONSTRAINT R_49 FOREIGN KEY (idConsultorio) REFERENCES consultorio (idConsultorio);

ALTER TABLE paciente
ADD CONSTRAINT R_39 FOREIGN KEY (idPaciente) REFERENCES persona (idPersona);

ALTER TABLE persona
ADD CONSTRAINT R_3 FOREIGN KEY (idRol) REFERENCES rol (idRol);

ALTER TABLE ubicacion
ADD CONSTRAINT R_20 FOREIGN KEY (idDireccion) REFERENCES direccion (idDireccion);

ALTER TABLE ubicacion
ADD CONSTRAINT R_21 FOREIGN KEY (idPaciente) REFERENCES paciente (idPaciente);
