create table company
(
    company_id   uuid    default public.uuid_generate_v4() not null
        constraint company_pkey
            primary key,
    nace_code_id uuid                                      not null
        constraint fk_nace
            references nacecode,
    name         varchar(255)                              not null,
    country_id   uuid                                      not null
        constraint fk_country
            references country,
    is_public    boolean default true                      not null
);