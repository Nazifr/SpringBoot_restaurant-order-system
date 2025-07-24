package com.nazifr.FoodOrderingService.enumsNur;


public enum SessionStatus {
    ACTIVE,           // Müşteri sipariş vermeye devam ediyor
    PAYMENT_PENDING,  // Sipariş verildi ama ödeme yapılmadı
    CLOSED,           // Hesap ödendi ve oturum kapatıldı
    CANCELLED         // Masa açıldı ama iptal edildi (opsiyonel durum)
}
