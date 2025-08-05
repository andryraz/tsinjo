create table if not exists payment (
                                       id UUID PRIMARY KEY,
                                       reference VARCHAR(255) UNIQUE,
                                       method VARCHAR(50),
                                       date TIMESTAMP,
                                       amount INT,
                                       status VARCHAR(50)
);