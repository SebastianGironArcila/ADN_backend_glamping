select count(1)
from reserva
where idGlamping = :idGlamping
  and (fechaEntrada between :fechaEntrada and :fechaSalida
  or fechaSalida between  :fechaEntrada and :fechaSalida)
