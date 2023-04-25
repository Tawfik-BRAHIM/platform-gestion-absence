import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModetdComponent } from './modetd.component';

describe('ModetdComponent', () => {
  let component: ModetdComponent;
  let fixture: ComponentFixture<ModetdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModetdComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ModetdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
