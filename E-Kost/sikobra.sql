-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jan 2022 pada 16.35
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sikobra`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_admin`
--

CREATE TABLE `data_admin` (
  `ID_Admin` varchar(10) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Username` varchar(16) NOT NULL,
  `Password` varchar(16) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `No_Telp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_admin`
--

INSERT INTO `data_admin` (`ID_Admin`, `Nama`, `Email`, `Username`, `Password`, `Alamat`, `No_Telp`) VALUES
('', '', '', '', '', '', ''),
('123', 'Lisa', 'lisa@gmail.com', 'lisa', 'lisa', 'Cimahi', '0812345678'),
('1234', 'Adam', 'adam@gmail.com', 'adam', '173243Adam', 'KP Pos Wetan', '089653939782'),
('12345', 'Kesyaaaa', 'kesya@gmail.com', 'kesyaaaa', 'kesya', 'Sukabumi', '0812345678'),
('123456', 'Kesya F', 'kesyaa@gmail.com', 'kesyaf', 'kesya', 'Sukabumi', '0812345678'),
('3411181005', 'Lulu Sabila Paza', 'lulu@gmail.com', 'lulusabila', 'lulu123', 'sukabumi', '089876543212'),
('6666', 'asmi', 'asmi@gmail.com', 'asmi', 'Asmi1234', 'pwk', '0888822222');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_customer`
--

CREATE TABLE `data_customer` (
  `ID_Customer` varchar(10) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `No_Telp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_customer`
--

INSERT INTO `data_customer` (`ID_Customer`, `Nama`, `Email`, `Alamat`, `No_Telp`) VALUES
('3333', 'lolo', 'lolo@gmail.com', 'sukabumi', '085678987655'),
('Adam', '123', '13', '311', '123'),
('123', 'Hari Joki', 'hari@gmail.com', 'Pwk', '12333');

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_kamar`
--

CREATE TABLE `data_kamar` (
  `ID_Kamar` varchar(15) NOT NULL,
  `No_Kamar` varchar(3) NOT NULL,
  `Nama_Pengisi` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_transaksii`
--

CREATE TABLE `data_transaksii` (
  `ID_Transaksi` varchar(10) NOT NULL,
  `ID_Customer` varchar(10) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `ID_Kamar` varchar(10) NOT NULL,
  `No_Kamar` varchar(3) NOT NULL,
  `Tgl_Masuk` date NOT NULL,
  `Tgl_Keluar` date NOT NULL,
  `Total_Pembayaran` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `data_transaksii`
--

INSERT INTO `data_transaksii` (`ID_Transaksi`, `ID_Customer`, `Nama`, `ID_Kamar`, `No_Kamar`, `Tgl_Masuk`, `Tgl_Keluar`, `Total_Pembayaran`) VALUES
('3333', '8888', 'gugu', '009', '9', '2022-01-04', '2022-01-18', '23455566'),
('4444', '555', 'agus', '2222', '3', '2022-01-12', '2022-01-12', '222222');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_admin`
--
ALTER TABLE `data_admin`
  ADD PRIMARY KEY (`ID_Admin`),
  ADD UNIQUE KEY `Username` (`Username`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- Indeks untuk tabel `data_kamar`
--
ALTER TABLE `data_kamar`
  ADD PRIMARY KEY (`ID_Kamar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
