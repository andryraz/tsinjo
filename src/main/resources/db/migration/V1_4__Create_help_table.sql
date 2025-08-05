create table if not exists help (
                                       id UUID PRIMARY KEY,
                                       beneficiary_id UUID REFERENCES beneficiary(id),
                                       payment_id UUID REFERENCES payment(id),
                                       description TEXT
);