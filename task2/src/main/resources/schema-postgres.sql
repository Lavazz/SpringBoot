CREATE TABLE public.user
(
    id bigserial,
    name character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    user_account_id bigint,
    CONSTRAINT user_pkey PRIMARY KEY (id),
);