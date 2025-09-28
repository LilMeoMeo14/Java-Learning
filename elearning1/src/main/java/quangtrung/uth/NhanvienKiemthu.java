package quangtrung.uth;

class NhanvienKiemthu extends NhanVien {
    public NhanvienKiemthu(){
        super();
        //super để gọi constructor của lớp cha (superclass)
        /*
        Nếu lớp cha có constructor rỗng (không tham số) thì super() sẽ gọi constructor đó.
        Nếu lớp cha chỉ có constructor có tham số, bạn phải gọi super(tham số...).
        */
    }
    
    public NhanvienKiemthu(String ms , String ht , double luongcb){
        super(ms,ht,luongcb);
    }
}
