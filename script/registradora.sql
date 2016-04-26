CREATE TABLE Registradora(
        Id INTEGER NOT NULL,        
        IdAsociado VARCHAR(20),
        Fecha DATE,
        PRIMARY KEY (Id)
);
CREATE TABLE Asociado(
    
    nombre VARCHAR(20),
    PRIMARY KEY (nombre )

);

