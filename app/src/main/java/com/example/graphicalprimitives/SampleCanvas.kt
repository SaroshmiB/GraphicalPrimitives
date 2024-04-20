package com.example.graphicalprimitives
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import android.graphics.Bitmap
class SampleCanvas(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val paint = Paint()
    private val bitmapWidth = 1500
    private val bitmapHeight = 1000
    private val bitmap = Bitmap.createBitmap(bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888)
    private val canvas = Canvas(bitmap)
    override fun onDraw(canvas: Canvas){
        super.onDraw(canvas)
        canvas.drawBitmap(bitmap, 0f, 0f, paint)
        canvas.drawColor(Color.BLACK)
        paint.textSize = 120f

        paint.color = Color.WHITE
        canvas.drawText("Graphical Primitives", 200f, 200f, paint)

        paint.color = Color.YELLOW
        canvas.drawRect(150f, 500f, 650f, 800f, paint)
        paint.color=Color.RED
        canvas.drawText("Rectangle",150f,920f,paint)

        paint.color = Color.BLUE
        canvas.drawCircle(1000f, 600f, 200f, paint)
        paint.color=Color.RED
        canvas.drawText("Circle",850f,920f,paint)

        paint.color = Color.GREEN
        canvas.drawRect(200f, 1400f, 400f, 1200f, paint)
        paint.color=Color.RED
        canvas.drawText("Square",180f,1750f,paint)


        paint.color = Color.CYAN
        canvas.drawLine(1000f, 1600f, 1020f, 1100f, paint)
        paint.color=Color.RED
        canvas.drawText("Line",870f,1750f,paint)


    }
}