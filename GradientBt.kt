fun GradiantButton(bText :String,TextColor : Color,color1 : Color,color2 :Color,onclick : ()->Unit) {
    Button(modifier = Modifier
        .background(
            brush = Brush.horizontalGradient(
                colors = listOf(
                    color1,
                    color2
                )
            ), shape = RoundedCornerShape(14.dp)
        )
        .height(ButtonDefaults.MinHeight),
        onClick = onclick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
    ) {
        Text(text = bText, color = TextColor)
    }
} 
