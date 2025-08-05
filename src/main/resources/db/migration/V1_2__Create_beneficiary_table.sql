create table if not exists beneficiary (
                                           id UUID PRIMARY KEY,
                                           full_name VARCHAR(255),
                                           email VARCHAR(255) UNIQUE
);