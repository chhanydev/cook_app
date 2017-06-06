-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 05, 2017 at 07:15 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myfood`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_foods`
--

CREATE TABLE `tbl_foods` (
  `_id` int(11) NOT NULL,
  `_name` varchar(100) NOT NULL,
  `_avatar` text NOT NULL,
  `_component` text NOT NULL,
  `_howtodo` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_foods`
--

INSERT INTO `tbl_foods` (`_id`, `_name`, `_avatar`, `_component`, `_howtodo`) VALUES
(1, 'koko foods', 'http://10.0.2.2/android/image/a.PNG', 'kfldsflkdsflkdsklfdlsfjkdjflksjflksfopdjfklfldsflkdsjfds', 'fkfdklfjdsklfjkdlsjfoijewjfkdjfoasjfojflkdsjfodjfkdslfjlkdsjfoewfkdsjofisduofajlfkjdiofjdsofjoiwejfijdfsdd'),
(2, 'fsfads', 'http://10.0.2.2/android/image/b.PNG', 'dsfdsafds', 'fdsfdsaf'),
(3, 'msi', 'http://10.0.2.2/android/image/Awesome-MSI-Wallpaper.jpg', 'good', 'dsfdsfds');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_foods`
--
ALTER TABLE `tbl_foods`
  ADD PRIMARY KEY (`_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_foods`
--
ALTER TABLE `tbl_foods`
  MODIFY `_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
