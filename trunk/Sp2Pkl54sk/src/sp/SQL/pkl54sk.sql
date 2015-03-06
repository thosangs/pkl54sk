-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 06, 2015 at 02:09 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pkl54sk`
--

-- --------------------------------------------------------

--
-- Table structure for table `b1`
--

CREATE TABLE IF NOT EXISTS `b1` (
  `nks` varchar(13) NOT NULL COMMENT 'Gabungan kode b1r1,b1r2,b1r3,b1r5,b1r6',
  `b1r1` enum('73','12') NOT NULL COMMENT 'Kabupaten/kota',
  `b1r2` varchar(3) NOT NULL COMMENT 'Kecamatan',
  `b1r3` varchar(3) NOT NULL COMMENT 'Desa/ Kelurahan',
  `b1r4` enum('1','2') NOT NULL COMMENT 'Klasifikasi desa/ Kelurahan',
  `b1r5` varchar(3) NOT NULL COMMENT 'Nomor Blok Sensus',
  `b1r6` varchar(2) NOT NULL COMMENT 'Nomor Urut Sampel ART',
  `b1r7` text NOT NULL COMMENT 'Nama kepala rumah tangga',
  `b1r8` text NOT NULL COMMENT 'Alamat lengkap (RT/RW/dusun)',
  `b1r9` enum('1','2','3') NOT NULL COMMENT 'Hasil kunjungan ke rumah tangga1',
  `b1r10` varchar(2) NOT NULL,
  `nim` varchar(6) NOT NULL,
  `flag` enum('0','1') NOT NULL,
  `flag2` enum('1','2') NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `b1`
--

INSERT INTO `b1` (`nks`, `b1r1`, `b1r2`, `b1r3`, `b1r4`, `b1r5`, `b1r6`, `b1r7`, `b1r8`, `b1r9`, `b1r10`, `nim`, `flag`, `flag2`, `timestamp`) VALUES
('731121B1', '73', '1', '12', '1', '1B', '1', 'Thosan Girisona', 'perumahan sukamaju', '1', '1', '127402', '1', '2', '2015-03-06 00:56:49'),
('731121B50', '73', '1', '12', '1', '1B', '50', 'Thosan Girisona', 'perumahan sukamaju', '1', '1', '127402', '0', '2', '2015-03-06 00:57:32');

-- --------------------------------------------------------

--
-- Table structure for table `b2`
--

CREATE TABLE IF NOT EXISTS `b2` (
  `nksb2` varchar(13) NOT NULL,
  `b2r1s1` text NOT NULL COMMENT 'nama pencacah',
  `b2r1s2` text NOT NULL COMMENT 'nama kortim',
  `b2r2s1` varchar(6) NOT NULL COMMENT 'NIM pencacah',
  `b2r2s2` varchar(6) NOT NULL COMMENT 'NIM kortim',
  `b2r3s1d1` enum('1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30','31') NOT NULL COMMENT 'tanggal pencacahan pencacah',
  `b2r3s1d2` enum('1','2','3','4','5','6','7','8','9','10','11','12') NOT NULL COMMENT 'bulan pencacahan pencacah',
  `b2r3s2d1` enum('1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30','31') NOT NULL COMMENT 'tanggal pencacahan kortim',
  `b2r3s2d2` enum('1','2','3','4','5','6','7','8','9','10','11','12') NOT NULL COMMENT 'bulan pencacahn kortim'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `b2`
--

INSERT INTO `b2` (`nksb2`, `b2r1s1`, `b2r1s2`, `b2r2s1`, `b2r2s2`, `b2r3s1d1`, `b2r3s1d2`, `b2r3s2d1`, `b2r3s2d2`) VALUES
('731121B1', 'Tiara', 'Choerul', '127403', '127403', '3', '3', '4', '3'),
('731121B50', 'Tiara', 'Choerul', '127403', '127403', '3', '3', '4', '3');

-- --------------------------------------------------------

--
-- Table structure for table `b3`
--

CREATE TABLE IF NOT EXISTS `b3` (
  `nksb3` varchar(21) NOT NULL,
  `b3r1` text NOT NULL COMMENT 'Nama',
  `b3r2` enum('1','2') NOT NULL COMMENT 'Jenis kelamin',
  `b3r3` varchar(2) NOT NULL COMMENT 'Umur',
  `b3r4s1` varchar(2) NOT NULL COMMENT 'Tempat lahir, Provinsi/negara',
  `b3r4s2` varchar(2) DEFAULT NULL,
  `b3r5s1` varchar(2) NOT NULL COMMENT 'Tempat tinggal 5 tahun yg lalu, Provinsi/negara',
  `b3r5s2` varchar(2) DEFAULT NULL,
  `b3r6` enum('1','2','3','4') NOT NULL COMMENT 'Status perkawinan',
  `b3r7` enum('0','1','2','3','4','5','6','7','8','9') NOT NULL COMMENT 'Ijazah terakhir',
  `b3r8s1` enum('1','2') NOT NULL,
  `b3r8s2` enum('1','2') NOT NULL,
  `b3r8s3` enum('1','2') NOT NULL,
  `b3r9s1d1` enum('1','2') NOT NULL COMMENT 'Kegiatan seminggu terakhir, bekerja',
  `b3r9s1d2` enum('1','2') NOT NULL,
  `b3r9s1d3` enum('1','2') NOT NULL,
  `b3r9s1d4` enum('1','2') NOT NULL,
  `b3r9s2` enum('1','2','3','4') DEFAULT NULL,
  `b3r10` enum('0','1','2') DEFAULT NULL COMMENT 'Lapangan usaha atau bidang pekerjaan seminggu terakhir',
  `b3r11` varchar(2) NOT NULL,
  `b3r12` enum('0','1','2','3','4','5','6') NOT NULL COMMENT 'Status/kedudukan dalam pekerjaan utama seminggu terakhir',
  `b3r13` enum('1','2','3','4','5','6','7') NOT NULL COMMENT 'Status penguasaan bangunan tempat tinggal',
  `b3r14` enum('1','2','3','4','5','6','7') NOT NULL COMMENT 'Jenis atap terluas',
  `b3r15` enum('1','2','3','4') NOT NULL COMMENT 'Jenis dinding terluas',
  `b3r16` enum('1','2','3','4','5','6') NOT NULL COMMENT 'Jenis lantai terluas'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `b3`
--

INSERT INTO `b3` (`nksb3`, `b3r1`, `b3r2`, `b3r3`, `b3r4s1`, `b3r4s2`, `b3r5s1`, `b3r5s2`, `b3r6`, `b3r7`, `b3r8s1`, `b3r8s2`, `b3r8s3`, `b3r9s1d1`, `b3r9s1d2`, `b3r9s1d3`, `b3r9s1d4`, `b3r9s2`, `b3r10`, `b3r11`, `b3r12`, `b3r13`, `b3r14`, `b3r15`, `b3r16`) VALUES
('731121B1', 'Thosan Girisona S', '1', '21', '18', '08', '18', '08', '1', '4', '2', '1', '1', '2', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('731121B50', 'Thosan Girisona S', '1', '21', '18', '08', '18', '08', '1', '4', '2', '1', '1', '2', '1', '1', '1', '3', '1', '1', '1', '1', '1', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `b4`
--

CREATE TABLE IF NOT EXISTS `b4` (
  `nksb4` varchar(13) NOT NULL,
  `b4ar1` enum('0','1','2','3','4') NOT NULL,
  `b4ar2` enum('0','1','2','3','4') NOT NULL,
  `b4ar3` enum('0','1','2','3','4') NOT NULL,
  `b4ar4` enum('0','1','2','3','4') NOT NULL,
  `b4ar5` enum('0','1','2','3','4') NOT NULL,
  `b4ar6` enum('0','1','2','3','4') NOT NULL,
  `b4ar7` enum('0','1','2','3','4') NOT NULL,
  `b4ar8` enum('0','1','2','3','4') NOT NULL,
  `b4ar9` enum('0','1','2','3','4') NOT NULL,
  `b4ar10` enum('0','1','2','3','4') NOT NULL,
  `b4ar11` enum('0','1','2','3','4') NOT NULL,
  `b4ar12` enum('0','1','2','3','4') NOT NULL,
  `b4ar13` enum('0','1','2','3','4') NOT NULL,
  `b4ar14` enum('0','1','2','3','4') NOT NULL,
  `b4ar15` enum('0','1','2','3','4') NOT NULL,
  `b4ar16` enum('0','1','2','3','4') NOT NULL,
  `b4ar17` enum('0','1','2','3','4') NOT NULL,
  `b4ar18` enum('0','1','2','3','4') NOT NULL,
  `b4ar19` enum('0','1','2','3','4') NOT NULL,
  `b4ar20` enum('0','1','2','3','4') NOT NULL,
  `b4ar21` enum('0','1','2','3','4') NOT NULL,
  `b4ar22` enum('0','1','2','3','4') NOT NULL,
  `b4ar23` enum('0','1','2','3','4') NOT NULL,
  `b4ar24` enum('0','1','2','3','4') NOT NULL,
  `b4ar25` enum('0','1','2','3','4') NOT NULL,
  `b4ar26` enum('0','1','2','3','4') NOT NULL,
  `b4ar27` enum('0','1','2','3','4') NOT NULL,
  `b4br1` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br2` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br3` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br4` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br5` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br6` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br7` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br8` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br9` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br10` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br11` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br12` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br13` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br14` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br15` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br16` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br17` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br18` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br19` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br20` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br21` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br22` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br23` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br24` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br25` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br26` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br27` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br28` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br29` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br30` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br31` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br32` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br33` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br34` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br35` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br36` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br37` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br38` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br39` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br40` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br41` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br42` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br43` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br44` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br45` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br46` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br47` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br48` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br49` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br50` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br51` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br52` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br53` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br54` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br55` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br56` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br57` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br58` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br59` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br60` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br61` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br62` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br63` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `b4br64` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `b4`
--

INSERT INTO `b4` (`nksb4`, `b4ar1`, `b4ar2`, `b4ar3`, `b4ar4`, `b4ar5`, `b4ar6`, `b4ar7`, `b4ar8`, `b4ar9`, `b4ar10`, `b4ar11`, `b4ar12`, `b4ar13`, `b4ar14`, `b4ar15`, `b4ar16`, `b4ar17`, `b4ar18`, `b4ar19`, `b4ar20`, `b4ar21`, `b4ar22`, `b4ar23`, `b4ar24`, `b4ar25`, `b4ar26`, `b4ar27`, `b4br1`, `b4br2`, `b4br3`, `b4br4`, `b4br5`, `b4br6`, `b4br7`, `b4br8`, `b4br9`, `b4br10`, `b4br11`, `b4br12`, `b4br13`, `b4br14`, `b4br15`, `b4br16`, `b4br17`, `b4br18`, `b4br19`, `b4br20`, `b4br21`, `b4br22`, `b4br23`, `b4br24`, `b4br25`, `b4br26`, `b4br27`, `b4br28`, `b4br29`, `b4br30`, `b4br31`, `b4br32`, `b4br33`, `b4br34`, `b4br35`, `b4br36`, `b4br37`, `b4br38`, `b4br39`, `b4br40`, `b4br41`, `b4br42`, `b4br43`, `b4br44`, `b4br45`, `b4br46`, `b4br47`, `b4br48`, `b4br49`, `b4br50`, `b4br51`, `b4br52`, `b4br53`, `b4br54`, `b4br55`, `b4br56`, `b4br57`, `b4br58`, `b4br59`, `b4br60`, `b4br61`, `b4br62`, `b4br63`, `b4br64`) VALUES
('731121B1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '5', '5', '4', '1', '2', '3', '4', '5', '6', '7', '8', '9', '7', '6', '6', '6', '6', '6', '6', '6', '6'),
('731121B50', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '5', '5', '4', '1', '2', '3', '4', '5', '6', '7', '8', '9', '7', '6', '6', '6', '6', '6', '6', '6', '6');

-- --------------------------------------------------------

--
-- Table structure for table `b5`
--

CREATE TABLE IF NOT EXISTS `b5` (
  `nksb5` varchar(13) NOT NULL,
  `catatan` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `opsi_tingkat_keseringan`
--

CREATE TABLE IF NOT EXISTS `opsi_tingkat_keseringan` (
  `kode` enum('1','2','3','4') NOT NULL,
  `keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_tingkat_keseringan`
--

INSERT INTO `opsi_tingkat_keseringan` (`kode`, `keterangan`) VALUES
('1', 'tidak pernah'),
('2', 'jarang'),
('3', 'sering'),
('4', 'selalu');

-- --------------------------------------------------------

--
-- Table structure for table `option_b1r1`
--

CREATE TABLE IF NOT EXISTS `option_b1r1` (
  `Kode` enum('73','12') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b1r1`
--

INSERT INTO `option_b1r1` (`Kode`, `Keterangan`) VALUES
('73', 'Bandung'),
('12', 'Indramayu');

-- --------------------------------------------------------

--
-- Table structure for table `option_b1r4`
--

CREATE TABLE IF NOT EXISTS `option_b1r4` (
  `Kode` enum('1','2') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b1r4`
--

INSERT INTO `option_b1r4` (`Kode`, `Keterangan`) VALUES
('1', 'Perkotaan'),
('2', 'Perdesaan');

-- --------------------------------------------------------

--
-- Table structure for table `option_b1r9`
--

CREATE TABLE IF NOT EXISTS `option_b1r9` (
  `Kode` enum('1','2','3') NOT NULL,
  `Keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b1r9`
--

INSERT INTO `option_b1r9` (`Kode`, `Keterangan`) VALUES
('1', 'Pencacahan berhasil'),
('2', 'Responden menolak diwawancarai'),
('3', 'Responden tidak dapat diwawancarai');

-- --------------------------------------------------------

--
-- Table structure for table `option_b3r2`
--

CREATE TABLE IF NOT EXISTS `option_b3r2` (
  `Kode` enum('1','2') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b3r2`
--

INSERT INTO `option_b3r2` (`Kode`, `Keterangan`) VALUES
('1', 'Laki laki'),
('2', 'Perempuan');

-- --------------------------------------------------------

--
-- Table structure for table `option_b3r6`
--

CREATE TABLE IF NOT EXISTS `option_b3r6` (
  `Kode` enum('1','2','3','4') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b3r6`
--

INSERT INTO `option_b3r6` (`Kode`, `Keterangan`) VALUES
('1', 'Belum kawin'),
('2', 'Kawin'),
('3', 'Cerai hidup'),
('4', 'Cerai mati');

-- --------------------------------------------------------

--
-- Table structure for table `option_b3r7`
--

CREATE TABLE IF NOT EXISTS `option_b3r7` (
  `Kode` enum('0','1','2','3','4','5','6','7','8','9') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b3r7`
--

INSERT INTO `option_b3r7` (`Kode`, `Keterangan`) VALUES
('0', 'Tidak pernah sekolah'),
('1', 'Tidak tamat SD/MI/SDLB/Paket A'),
('2', 'SD/MI/sederajat'),
('3', 'SMP/MTs/sederajat'),
('4', 'SLTA/MA/'),
('5', 'SM Kejuruan'),
('6', 'Diploma I/II'),
('7', 'Diploma III/Akademi'),
('8', 'Diploma IV/S1'),
('9', 'S2,S3');

-- --------------------------------------------------------

--
-- Table structure for table `option_b3r12`
--

CREATE TABLE IF NOT EXISTS `option_b3r12` (
  `Kode` enum('1','2','3','4','5','6') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b3r12`
--

INSERT INTO `option_b3r12` (`Kode`, `Keterangan`) VALUES
('1', 'Berusaha sendiri'),
('2', 'Berusaha dibantu buruh tidak t'),
('3', 'Berusaha dibantu buruh tetap'),
('4', 'Buruh/karyawan/pegawai'),
('5', 'Pekerja bebas'),
('6', 'Pekerja keluarga/tidak dibayar');

-- --------------------------------------------------------

--
-- Table structure for table `option_b3r13`
--

CREATE TABLE IF NOT EXISTS `option_b3r13` (
  `Kode` enum('1','2','3','4','5','6','7') NOT NULL,
  `Keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b3r13`
--

INSERT INTO `option_b3r13` (`Kode`, `Keterangan`) VALUES
('1', 'Milik Sendiri'),
('2', 'Kontrak'),
('3', 'Sewa'),
('4', 'Bebas sewa milik orang lain'),
('5', 'Bebas sewa milik orang tua/sanak/saudara'),
('6', 'Dinas'),
('7', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `option_b3r14`
--

CREATE TABLE IF NOT EXISTS `option_b3r14` (
  `Kode` enum('1','2','3','4','5','6','7') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b3r14`
--

INSERT INTO `option_b3r14` (`Kode`, `Keterangan`) VALUES
('1', 'Beton'),
('2', 'Genteng'),
('3', 'Sirap'),
('4', 'Seng'),
('5', 'Asbes'),
('6', 'Ijuk/rumbia'),
('7', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `option_b3r15`
--

CREATE TABLE IF NOT EXISTS `option_b3r15` (
  `Kode` enum('1','2','3','4') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b3r15`
--

INSERT INTO `option_b3r15` (`Kode`, `Keterangan`) VALUES
('1', 'Tembok'),
('2', 'Kayu'),
('3', 'Bambu'),
('4', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `option_b3r16`
--

CREATE TABLE IF NOT EXISTS `option_b3r16` (
  `Kode` enum('1','2','3','4','5','6') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_b3r16`
--

INSERT INTO `option_b3r16` (`Kode`, `Keterangan`) VALUES
('1', 'Marmer/keramik/granit'),
('2', 'Tegel/teraso'),
('3', 'Semen'),
('4', 'Kayu'),
('5', 'Tanah'),
('6', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `option_ya_tidak`
--

CREATE TABLE IF NOT EXISTS `option_ya_tidak` (
  `Kode` enum('1','2') NOT NULL,
  `Keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `option_ya_tidak`
--

INSERT INTO `option_ya_tidak` (`Kode`, `Keterangan`) VALUES
('1', 'Ya'),
('2', 'Tidak');

-- --------------------------------------------------------

--
-- Table structure for table `username`
--

CREATE TABLE IF NOT EXISTS `username` (
  `user` varchar(6) NOT NULL,
  `pw` varchar(5) NOT NULL,
  `nama` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `username`
--

INSERT INTO `username` (`user`, `pw`, `nama`) VALUES
('127000', 'asd', 'Dummy'),
('127402', 'asd', 'Thosan Girisona S');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `b1`
--
ALTER TABLE `b1`
 ADD PRIMARY KEY (`nks`), ADD KEY `b1r1` (`b1r1`), ADD KEY `b1r4` (`b1r4`), ADD KEY `b1r9` (`b1r9`), ADD KEY `b1r9_2` (`b1r9`), ADD KEY `b1r4_2` (`b1r4`), ADD KEY `b1r1_2` (`b1r1`);

--
-- Indexes for table `b2`
--
ALTER TABLE `b2`
 ADD PRIMARY KEY (`nksb2`);

--
-- Indexes for table `b3`
--
ALTER TABLE `b3`
 ADD PRIMARY KEY (`nksb3`), ADD KEY `b3r12` (`b3r12`), ADD KEY `b3r13` (`b3r13`), ADD KEY `b3r14` (`b3r14`), ADD KEY `b3r15` (`b3r15`), ADD KEY `b3r16` (`b3r16`), ADD KEY `b3r2` (`b3r2`), ADD KEY `b3r6` (`b3r6`), ADD KEY `b3r7` (`b3r7`), ADD KEY `b3r8s1` (`b3r8s1`), ADD KEY `b3r8s2` (`b3r8s2`), ADD KEY `b3r8s3` (`b3r8s3`), ADD KEY `b3r9s1d1` (`b3r9s1d1`), ADD KEY `b3r9s1d2` (`b3r9s1d2`), ADD KEY `b3r9s1d3` (`b3r9s1d3`), ADD KEY `b3r9s1d4` (`b3r9s1d4`);

--
-- Indexes for table `b4`
--
ALTER TABLE `b4`
 ADD PRIMARY KEY (`nksb4`), ADD KEY `b4ar1` (`b4ar1`), ADD KEY `b4ar2` (`b4ar2`), ADD KEY `b4ar3` (`b4ar3`), ADD KEY `b4ar4` (`b4ar4`), ADD KEY `b4ar5` (`b4ar5`), ADD KEY `b4ar6` (`b4ar6`), ADD KEY `b4ar7` (`b4ar7`), ADD KEY `b4ar8` (`b4ar8`), ADD KEY `b4ar9` (`b4ar9`), ADD KEY `b4ar10` (`b4ar10`), ADD KEY `b4ar11` (`b4ar11`), ADD KEY `b4ar12` (`b4ar12`), ADD KEY `b4ar13` (`b4ar13`), ADD KEY `b4ar14` (`b4ar14`), ADD KEY `b4ar15` (`b4ar15`), ADD KEY `b4ar16` (`b4ar16`), ADD KEY `b4ar17` (`b4ar17`), ADD KEY `b4ar18` (`b4ar18`), ADD KEY `b4ar19` (`b4ar19`), ADD KEY `b4ar20` (`b4ar20`), ADD KEY `b4ar21` (`b4ar21`), ADD KEY `b4ar22` (`b4ar22`), ADD KEY `b4ar23` (`b4ar23`), ADD KEY `b4ar24` (`b4ar24`), ADD KEY `b4ar25` (`b4ar25`), ADD KEY `b4ar26` (`b4ar26`), ADD KEY `b4ar27` (`b4ar27`);

--
-- Indexes for table `b5`
--
ALTER TABLE `b5`
 ADD PRIMARY KEY (`nksb5`);

--
-- Indexes for table `opsi_tingkat_keseringan`
--
ALTER TABLE `opsi_tingkat_keseringan`
 ADD PRIMARY KEY (`kode`);

--
-- Indexes for table `option_b1r1`
--
ALTER TABLE `option_b1r1`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b1r4`
--
ALTER TABLE `option_b1r4`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b1r9`
--
ALTER TABLE `option_b1r9`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b3r2`
--
ALTER TABLE `option_b3r2`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b3r6`
--
ALTER TABLE `option_b3r6`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b3r7`
--
ALTER TABLE `option_b3r7`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b3r12`
--
ALTER TABLE `option_b3r12`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b3r13`
--
ALTER TABLE `option_b3r13`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b3r14`
--
ALTER TABLE `option_b3r14`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b3r15`
--
ALTER TABLE `option_b3r15`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_b3r16`
--
ALTER TABLE `option_b3r16`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `option_ya_tidak`
--
ALTER TABLE `option_ya_tidak`
 ADD PRIMARY KEY (`Kode`);

--
-- Indexes for table `username`
--
ALTER TABLE `username`
 ADD PRIMARY KEY (`user`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `b1`
--
ALTER TABLE `b1`
ADD CONSTRAINT `b1_ibfk_1` FOREIGN KEY (`b1r1`) REFERENCES `option_b1r1` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b1_ibfk_2` FOREIGN KEY (`b1r4`) REFERENCES `option_b1r4` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b1_ibfk_3` FOREIGN KEY (`b1r9`) REFERENCES `option_b1r9` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b2`
--
ALTER TABLE `b2`
ADD CONSTRAINT `b2_ibfk_1` FOREIGN KEY (`nksb2`) REFERENCES `b1` (`nks`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b3`
--
ALTER TABLE `b3`
ADD CONSTRAINT `b3_ibfk_1` FOREIGN KEY (`nksb3`) REFERENCES `b1` (`nks`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_10` FOREIGN KEY (`b3r8s3`) REFERENCES `option_ya_tidak` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_11` FOREIGN KEY (`b3r9s1d1`) REFERENCES `option_ya_tidak` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_12` FOREIGN KEY (`b3r9s1d2`) REFERENCES `option_ya_tidak` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_13` FOREIGN KEY (`b3r9s1d3`) REFERENCES `option_ya_tidak` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_14` FOREIGN KEY (`b3r9s1d4`) REFERENCES `option_ya_tidak` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_15` FOREIGN KEY (`b3r7`) REFERENCES `option_b3r7` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_16` FOREIGN KEY (`b3r2`) REFERENCES `option_b3r2` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_2` FOREIGN KEY (`b3r12`) REFERENCES `option_b3r12` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_3` FOREIGN KEY (`b3r13`) REFERENCES `option_b3r13` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_4` FOREIGN KEY (`b3r14`) REFERENCES `option_b3r14` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_5` FOREIGN KEY (`b3r15`) REFERENCES `option_b3r15` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_6` FOREIGN KEY (`b3r16`) REFERENCES `option_b3r16` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_7` FOREIGN KEY (`b3r6`) REFERENCES `option_b3r6` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_8` FOREIGN KEY (`b3r8s1`) REFERENCES `option_ya_tidak` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b3_ibfk_9` FOREIGN KEY (`b3r8s2`) REFERENCES `option_ya_tidak` (`Kode`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b4`
--
ALTER TABLE `b4`
ADD CONSTRAINT `b4_ibfk_1` FOREIGN KEY (`nksb4`) REFERENCES `b1` (`nks`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_10` FOREIGN KEY (`b4ar9`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_11` FOREIGN KEY (`b4ar10`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_12` FOREIGN KEY (`b4ar11`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_13` FOREIGN KEY (`b4ar12`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_14` FOREIGN KEY (`b4ar13`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_15` FOREIGN KEY (`b4ar14`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_16` FOREIGN KEY (`b4ar15`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_17` FOREIGN KEY (`b4ar16`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_18` FOREIGN KEY (`b4ar17`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_19` FOREIGN KEY (`b4ar18`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_2` FOREIGN KEY (`b4ar1`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_20` FOREIGN KEY (`b4ar19`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_21` FOREIGN KEY (`b4ar20`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_22` FOREIGN KEY (`b4ar21`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_23` FOREIGN KEY (`b4ar22`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_24` FOREIGN KEY (`b4ar23`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_25` FOREIGN KEY (`b4ar24`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_26` FOREIGN KEY (`b4ar25`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_27` FOREIGN KEY (`b4ar26`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_28` FOREIGN KEY (`b4ar27`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_3` FOREIGN KEY (`b4ar2`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_4` FOREIGN KEY (`b4ar3`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_5` FOREIGN KEY (`b4ar4`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_6` FOREIGN KEY (`b4ar5`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_7` FOREIGN KEY (`b4ar6`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_8` FOREIGN KEY (`b4ar7`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `b4_ibfk_9` FOREIGN KEY (`b4ar8`) REFERENCES `opsi_tingkat_keseringan` (`kode`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b5`
--
ALTER TABLE `b5`
ADD CONSTRAINT `b5_ibfk_1` FOREIGN KEY (`nksb5`) REFERENCES `b1` (`nks`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;