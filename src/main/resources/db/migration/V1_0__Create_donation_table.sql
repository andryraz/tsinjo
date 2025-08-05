create table if not exists donation
(
    id UUID PRIMARY KEY,
    donor_id UUID REFERENCES donor(id),
    payment_id UUID REFERENCES payment(id)
);
