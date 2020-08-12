/*==============================================================*/
/* DBMS name:      PostgreSQL 9.x                               */
/* Created on:     22/05/2020 14.32.38                          */
/*==============================================================*/


/*==============================================================*/
/* Table: ADMIN                                                 */
/*==============================================================*/
create table ADMIN (
   ID_ADMIN             INT4                 not null,
   ID_PEMERIKSAAN       VARCHAR(10)          not null,
   NAMA_ADMIN           VARCHAR(50)          not null,
   PASSWORD_ADMIN       VARCHAR(8)           not null,
   USERNAME_ADMIN       VARCHAR(25)          not null,
   constraint PK_ADMIN primary key (ID_ADMIN)
);

/*==============================================================*/
/* Index: ADMIN_PK                                              */
/*==============================================================*/
create unique index ADMIN_PK on ADMIN (
ID_ADMIN
);

/*==============================================================*/
/* Index: RELATIONSHIP_2_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_2_FK on ADMIN (
ID_PEMERIKSAAN
);

/*==============================================================*/
/* Table: PEMERIKSAAN                                           */
/*==============================================================*/
create table PEMERIKSAAN (
   ID_PEMERIKSAAN       VARCHAR(10)          not null,
   WAKTU_PEMERIKSAAN    DATE                 not null,
   DOKTER               VARCHAR(10)          not null,
   constraint PK_PEMERIKSAAN primary key (ID_PEMERIKSAAN)
);

/*==============================================================*/
/* Index: PEMERIKSAAN_PK                                        */
/*==============================================================*/
create unique index PEMERIKSAAN_PK on PEMERIKSAAN (
ID_PEMERIKSAAN
);

/*==============================================================*/
/* Table: PENDAFTARAN                                           */
/*==============================================================*/
create table PENDAFTARAN (
   ID_PENDAFTARAN       INT4                 not null,
   ID_ADMIN             INT4                 not null,
   NIK                  VARCHAR(16)          not null,
   NAMA                 VARCHAR(20)          not null,
   ALAMAT               VARCHAR(100)         not null,
   GENDER               VARCHAR(15)          not null,
   PASSWORD             VARCHAR(10)          not null,
   GOLDARAH             CHAR(2)              not null,
   constraint PK_PENDAFTARAN primary key (ID_PENDAFTARAN)
);

/*==============================================================*/
/* Index: PENDAFTARAN_PK                                        */
/*==============================================================*/
create unique index PENDAFTARAN_PK on PENDAFTARAN (
ID_PENDAFTARAN
);

/*==============================================================*/
/* Index: RELATIONSHIP_1_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_1_FK on PENDAFTARAN (
ID_ADMIN
);

/*==============================================================*/
/* Table: RAWAT_INAP                                            */
/*==============================================================*/
create table RAWAT_INAP (
   ID_RAWAT_INAP        INT4                 not null,
   ID_PEMERIKSAAN       VARCHAR(10)          null,
   RUANGAN              VARCHAR(10)          not null,
   POSITIF_COVID        BOOL                 not null,
   KAPASITAS_RUANGAN    INT4                 not null,
   constraint PK_RAWAT_INAP primary key (ID_RAWAT_INAP)
);

/*==============================================================*/
/* Index: RAWAT_INAP_PK                                         */
/*==============================================================*/
create unique index RAWAT_INAP_PK on RAWAT_INAP (
ID_RAWAT_INAP
);

/*==============================================================*/
/* Index: RELATIONSHIP_3_FK                                     */
/*==============================================================*/
create  index RELATIONSHIP_3_FK on RAWAT_INAP (
ID_PEMERIKSAAN
);

alter table ADMIN
   add constraint FK_ADMIN_RELATIONS_PEMERIKS foreign key (ID_PEMERIKSAAN)
      references PEMERIKSAAN (ID_PEMERIKSAAN)
      on delete restrict on update restrict;

alter table PENDAFTARAN
   add constraint FK_PENDAFTA_RELATIONS_ADMIN foreign key (ID_ADMIN)
      references ADMIN (ID_ADMIN)
      on delete restrict on update restrict;

alter table RAWAT_INAP
   add constraint FK_RAWAT_IN_RELATIONS_PEMERIKS foreign key (ID_PEMERIKSAAN)
      references PEMERIKSAAN (ID_PEMERIKSAAN)
      on delete restrict on update restrict;

