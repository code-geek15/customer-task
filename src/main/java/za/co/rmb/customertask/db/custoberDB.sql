PGDMP  *                     |            customer    16.2    16.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    24576    customer    DATABASE     �   CREATE DATABASE customer WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE customer;
                postgres    false            �            1259    24578    customer    TABLE     �   CREATE TABLE public.customer (
    customerid bigint NOT NULL,
    customer_name character varying(255),
    customer_phone_num character varying(255),
    customer_surname character varying(255),
    customer_email character varying(255)
);
    DROP TABLE public.customer;
       public         heap    postgres    false            �            1259    24577    customer_customerid_seq    SEQUENCE     �   CREATE SEQUENCE public.customer_customerid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.customer_customerid_seq;
       public          postgres    false    216            �           0    0    customer_customerid_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.customer_customerid_seq OWNED BY public.customer.customerid;
          public          postgres    false    215            Q           2604    24581    customer customerid    DEFAULT     z   ALTER TABLE ONLY public.customer ALTER COLUMN customerid SET DEFAULT nextval('public.customer_customerid_seq'::regclass);
 B   ALTER TABLE public.customer ALTER COLUMN customerid DROP DEFAULT;
       public          postgres    false    216    215    216            �          0    24578    customer 
   TABLE DATA           s   COPY public.customer (customerid, customer_name, customer_phone_num, customer_surname, customer_email) FROM stdin;
    public          postgres    false    216   �       �           0    0    customer_customerid_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.customer_customerid_seq', 1, true);
          public          postgres    false    215            S           2606    24585    customer customer_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.customer
    ADD CONSTRAINT customer_pkey PRIMARY KEY (customerid);
 @   ALTER TABLE ONLY public.customer DROP CONSTRAINT customer_pkey;
       public            postgres    false    216            �   8   x�3�������6426153��4�t�O��
��:�V$���%��r��qqq H��     