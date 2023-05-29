CREATE TABLE TiposIdentificacion (
    ID INT IDENTITY(1,1),
    CodigoTipoIdentificacion NVARCHAR(50),
	Descripcion NVARCHAR(500),
    PRIMARY KEY (ID)
);

CREATE TABLE Planes (
    ID INT IDENTITY(1,1),
    CodigoPlan NVARCHAR(100),
    Descripcion NVARCHAR(500),
    PRIMARY KEY (ID)
);

CREATE TABLE Usuarios (
    ID INT IDENTITY(1,1),
    TipoDocumentoID INT,
    NumeroDocumento NVARCHAR(50),
    FechaNacimiento DATE,
    PrimerNombre NVARCHAR(100),
    SegundoNombre NVARCHAR(100),
    PrimerApellido NVARCHAR(100),
    SegundoApellido NVARCHAR(100),
    DireccionResidencia NVARCHAR(200),
    NumeroCelular NVARCHAR(20),
    Email NVARCHAR(100),
    PlanID INT,
    PRIMARY KEY (TipoDocumentoID,ID),
    FOREIGN KEY (TipoDocumentoID) REFERENCES TiposIdentificacion(ID),
    FOREIGN KEY (PlanID) REFERENCES Planes(ID)
);


