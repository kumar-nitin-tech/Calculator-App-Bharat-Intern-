package com.example.calculator_app.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator_app.R
import com.example.calculator_app.events.CalcAction
import com.example.calculator_app.events.CalcOperation
import com.example.calculator_app.events.CalcState


@Composable
fun Calculator(
    state : CalcState,
    buttonSpacing : Dp,
    modifier: Modifier = Modifier,
    onAction: (CalcAction)->Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 30.dp),
                fontWeight = FontWeight.Light,
                color = Color.Black,
                maxLines = 2,
                style = TextStyle(
                    fontSize = 70.sp
                )
            )

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                thickness = 0.3.dp,
            )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { onAction(CalcAction.Clear) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp)
                            .width(146.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = "Ac",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Delete)},
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.delete),
                            contentDescription = "Backspace Button Icon",
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Button(
                        onClick = { onAction(CalcAction.Operation(CalcOperation.Divide)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " / ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { onAction(CalcAction.Number(7)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 7 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = {onAction(CalcAction.Number(8)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 8 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Number(9)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 9 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Operation(CalcOperation.Multiply))},
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " x ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { onAction(CalcAction.Number(4)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 4 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Number(5)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 5 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Number(6)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 6 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Operation(CalcOperation.Subtract)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " - ",
                            fontSize = 25.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { onAction(CalcAction.Number(1))},
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 1 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Number(2)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 2 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Number(3)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 3 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Operation(CalcOperation.Add)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " + ",
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        onClick = { onAction(CalcAction.Number(0)) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp)
                            .width(146.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " 0 ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }

                    Button(
                        onClick = { onAction(CalcAction.Decimal) },
                        shape = RoundedCornerShape(16.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.White)
                    ) {
                        Text(
                            text = " . ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.Black
                            )
                        )
                    }
                    Button(
                        onClick = { onAction(CalcAction.Calculate) },
                        shape = RoundedCornerShape(100.dp),
                        modifier = Modifier
                            .height(62.dp),
                        colors = ButtonDefaults.buttonColors(Color.Blue)
                    ) {
                        Text(
                            text = " = ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.White
                            )
                        )
                    }
                }
        }
    }
}

