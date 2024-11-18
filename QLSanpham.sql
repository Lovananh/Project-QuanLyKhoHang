create database QLSanpham;

USE QLSanpham;


CREATE TABLE LoaiSP (
    Maloai char(2) PRIMARY KEY,
	Tenloai nvarchar(20) 
);

CREATE TABLE Sanpham (
	MaSP char(4) PRIMARY KEY,
	TenSP nvarchar(20),
	Dongia bigint,
	Maloai char(2) foreign key references LoaiSP(Maloai)
);
