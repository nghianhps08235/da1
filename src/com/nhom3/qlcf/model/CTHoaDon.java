/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.model;

/**
 *
 * @author baotri1998
 */
public class CTHoaDon {

    private int id;
    private HoaDon maHoaDon;
    private SanPham maSanPham;
    private Extra extra;
    private int soLuong;

    public CTHoaDon() {
    }

    public CTHoaDon(int id) {
        this.id = id;
    }

    public CTHoaDon(int id, HoaDon maHoaDon, SanPham maSanPham, Extra extra, int soLuong) {
        this.id = id;
        this.maHoaDon = maHoaDon;
        this.maSanPham = maSanPham;
        this.extra = extra;
        this.soLuong = soLuong;
    }

    public CTHoaDon(HoaDon maHoaDon, SanPham maSanPham, Extra extra, int soLuong) {
        this.maHoaDon = maHoaDon;
        this.maSanPham = maSanPham;
        this.extra = extra;
        this.soLuong = soLuong;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HoaDon getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(HoaDon maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public SanPham getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(SanPham maSanPham) {
        this.maSanPham = maSanPham;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
